package com.example.top_trumps_start_code.controller;


import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.service.TopTrumpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping ("/play")
public class TopTrumpsController {

    @Autowired
    TopTrumpsService topTrumpsService;

    @GetMapping
    public ResponseEntity<String> tempMehthod() {
        return new ResponseEntity<>()
    }


    @PostMapping("/newGame")
    public ResponseEntity<String> startNewGame() {
        return new ResponseEntity<>(topTrumpsService.startNewGame(), HttpStatus.CREATED);
    }


    @PostMapping("/startGame")
    public ResponseEntity<String> playRound(@RequestBody ArrayList<Card> cards) {
        if (cards.size() <= 2) {
            return new ResponseEntity<>(topTrumpsService.checkWinner(cards.get(0),cards.get(1)), HttpStatus.OK);
        }

        return null;
    }




}
