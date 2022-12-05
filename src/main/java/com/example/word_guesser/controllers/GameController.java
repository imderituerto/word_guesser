package com.example.word_guesser.controllers;

import com.example.word_guesser.models.Game;
import com.example.word_guesser.models.Reply;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    private Game game;
    private String currentWord;
    private ArrayList<String> guessedLetters;

    //post request
    @PostMapping
    public ResponseEntity<Reply> newGame(){
        this.game = new Game("hello", 0, false);
        this.currentWord = "*****";
        this.guessedLetters = new ArrayList<>();
        Reply reply = new Reply("*****", "New game started");
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    //get request
    @GetMapping
    public ResponseEntity<Reply> getGameStatus(){
        Reply reply = new Reply(this.currentWord, "Game in progress");
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

}
