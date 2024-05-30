package com.example.top_trumps_start_code.controller;


import com.example.top_trumps_start_code.models.Card;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("play")
public class TopTrumpsController {

    @PostMapping
    public ResponseEntity<Card> playGame() {
        Card card = topTrumpService.playGame();
        return new ResponseEntity<>(card, HttpStatus.CREATED);
    }
}
