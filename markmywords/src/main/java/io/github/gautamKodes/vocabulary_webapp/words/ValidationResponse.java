package io.github.gautamKodes.vocabulary_webapp.words;

public class ValidationResponse {
    public String result;

    public ValidationResponse (){}
    public ValidationResponse(String result){
        this.result = result;
    }

    //get
    public String getResult(){
        return result;
    }
    //set

    public void setResult(String result) {
        this.result = result;
    }
}
