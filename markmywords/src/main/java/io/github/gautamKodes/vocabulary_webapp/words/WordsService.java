package io.github.gautamKodes.vocabulary_webapp.words;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Optional;

@Service
public class WordsService {
    private final WordsRepository wordsRepository;
    private final RestClient restClient;


    @Autowired
    public WordsService (WordsRepository wordsRepository, RestClient restClient){
        this.wordsRepository = wordsRepository;
        this.restClient = restClient;
    }

    public Optional<Word> getWord(Long id){
        return wordsRepository.findById(id);
    }

    public String validateSentence(Long wordId, String sentence){
        Word word = wordsRepository.findById(wordId)
                .orElseThrow(() -> new IllegalArgumentException("Word cannot be located"));

        ValidationRequest requestPayload = new ValidationRequest(word.getWord(), sentence);

        ValidationResponse responsePayload = restClient.post().uri("http://localhost:8000/validate")
                .body(requestPayload)
                .retrieve()
                .body(ValidationResponse.class);

                if (responsePayload != null){
                    return responsePayload.getResult();
                } else {
                    return "No response from the validation service";
                }
    }

    public String validateMeaning(Long wordId, String meaning){
        Word word = wordsRepository.findById(wordId)
                .orElseThrow(() -> new IllegalArgumentException("Word not found in database"));

        ValidateMeaningRequest requesPayload = new ValidateMeaningRequest(word.getWord(), meaning);

        ValidateMeaningResponse responsePayload = restClient.post().uri("http://localhost:8000/validateMeaning")
                .body(requesPayload)
                .retrieve()
                .body(ValidateMeaningResponse.class);

                if (responsePayload != null){
                    return responsePayload.getResult();
                } else {
                    return "No response from the validation service";
                }
    }
}
