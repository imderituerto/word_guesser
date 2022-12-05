package com.example.word_guesser.models;

//POJO class
public class Game {
    private String word;
    private int guesses;
    private boolean complete;

    //constructor with arguments
    public Game(String word, int guesses, boolean complete){
        this.complete = complete;
        this.guesses = guesses;
        this.word = word;
    }

    //overloaded empty constructor (JSON)
    public Game(){
    }

    //getters & setters
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

}
