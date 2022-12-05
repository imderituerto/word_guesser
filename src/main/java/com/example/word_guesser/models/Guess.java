package com.example.word_guesser.models;

//DTO as POJO class to send Client response to Server
public class Guess {

    private String letter;

    public Guess(String letter){
        this.letter = letter;
    }

    public Guess(){

    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

}
