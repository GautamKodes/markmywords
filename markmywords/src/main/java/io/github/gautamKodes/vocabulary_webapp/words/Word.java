package io.github.gautamKodes.vocabulary_webapp.words;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    private String type;
    private String sentence;

    public Long getId(){
        return id;
    }
    public String getWord(){
        return word;
    }
    public String getType(){
        return type;
    }
    public String getSentence(){
        return sentence;
    }
    public Word(){}

    public Word(String word, String type, String sentence){
        this.word = word;
        this.type = type;
        this.sentence = sentence;
    }
}
