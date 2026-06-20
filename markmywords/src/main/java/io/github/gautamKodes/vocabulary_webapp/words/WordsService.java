package io.github.gautamKodes.vocabulary_webapp.words;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WordsService {
    private final WordsRepository wordsRepository;
    @Autowired
    public WordsService (WordsRepository wordsRepository){
        this.wordsRepository = wordsRepository;
    }

    public Optional<Word> getWord(Long id){
        return wordsRepository.findById(id);
    }
}
