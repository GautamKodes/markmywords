package io.github.gautamKodes.vocabulary_webapp.words;

import org.springframework.data.jpa.repository.query.PreprocessedQuery;

public class ValidationRequest {
    private String word;
    private String sentence;

    public ValidationRequest(){}

    public  ValidationRequest(String word, String sentence){
        this.word = word;
        this.sentence = sentence;
    }
    //get
    public String getWord(){
        return word;
    }
    public String getSentence(){
        return sentence;
    }

    //set

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
