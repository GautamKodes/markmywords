package io.github.gautamKodes.vocabulary_webapp.words;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
