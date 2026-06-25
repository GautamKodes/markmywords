package io.github.gautamKodes.vocabulary_webapp.words;

import javax.sql.rowset.spi.SyncResolver;

public class ValidateMeaningRequest {
    private String word;
    private String meaning;

    public ValidateMeaningRequest(){}

    public ValidateMeaningRequest(String word, String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    //get
    public String getWord(){ return word; }
    public String getMeaning(){ return meaning; }

    //set
    public void setMeaning(String meaning){
        this.meaning = meaning;
    }
    public void setWord(String word){
        this.word = word;
    }

}
