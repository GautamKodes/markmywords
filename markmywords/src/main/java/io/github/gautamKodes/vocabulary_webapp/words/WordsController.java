package io.github.gautamKodes.vocabulary_webapp.words;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/words")
public class WordsController {
    private final WordsService wordsService;

    @Autowired
    public WordsController(WordsService wordsService){
        this.wordsService = wordsService;
    }

    @GetMapping("/{id}")
    public Optional<Word> getWord(@PathVariable Long id){
        return wordsService.getWord(id);
    }

    @PostMapping("/{id}/validate")
    public String validateWord(@PathVariable Long id, @RequestBody String sentence){
        return wordsService.validateSentence(id, sentence);
    }

    @PostMapping("/{id}/validate_meaning")
    public String validateMeaning(@PathVariable Long id, @RequestBody String meaning){
        return wordsService.validateMeaning(id, meaning);
    }
}
