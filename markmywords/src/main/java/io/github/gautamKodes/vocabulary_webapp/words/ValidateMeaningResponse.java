package io.github.gautamKodes.vocabulary_webapp.words;

public class ValidateMeaningResponse {
    public String result;

    public ValidateMeaningResponse(){}

    public ValidateMeaningResponse(String result){ this.result = result; }

    //get
    public String getResult(){return result; }
    public void setResult(String result){
        this.result = result;
    }
}
