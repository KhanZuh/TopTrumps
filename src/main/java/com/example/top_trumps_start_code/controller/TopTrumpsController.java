package com.example.top_trumps_start_code.controller;


import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.service.TopTrumpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping ("play")
public class TopTrumpsController {

    @Autowired
    TopTrumpsService topTrumpsService;

//    @PostMapping
//    public ResponseEntity<ArrayList<Card>> playGame() {
//        ArrayList <Card> card = topTrumpsService.playGame();
//        return new ResponseEntity<ArrayList<Card>>(card, HttpStatus.CREATED);
//    }

    @PostMapping
    public ResponseEntity<String> playRound(@RequestBody ArrayList<Card> cards) {
        if (cards.size() <= 2) {
            return new ResponseEntity<>("Game started", HttpStatus.OK);
        }

        return null;
    }


}
