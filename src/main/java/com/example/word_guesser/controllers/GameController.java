package com.example.word_guesser.controllers;

import com.example.word_guesser.models.Game;
import com.example.word_guesser.models.Reply;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @PostMapping
    public ResponseEntity<Reply> newGame(){
        Game game = new Game("hello", 0, false);
        Reply reply = new Reply("*****", "New game started");
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }


}
