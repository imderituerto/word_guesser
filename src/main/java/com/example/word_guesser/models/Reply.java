package com.example.word_guesser.models;

//DTO as POJO class to send Server response to Client
public class Reply {

    private String wordState;
    private String message;

    public Reply(String wordState, String message){
        this.message = message;
        this.wordState = wordState;
    }

    public Reply(){
    }

    public String getWordState() {
        return wordState;
    }

    public void setWordState(String wordState) {
        this.wordState = wordState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
