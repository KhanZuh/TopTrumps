package com.example.top_trumps_start_code.service;


import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpsService {

    private Rank rank;
    private Suit suit;
    private Card card;
    private ArrayList<Card> cards;

    public TopTrumpsService() {

    }

    public String checkWinner(Card card1, Card card2) {


        if (card1.getCardValue() > card2.getCardValue()) {
            return card1 + " wins!";
        } else if (card1.getCardValue() < card2.getCardValue()) {
            return card2 + " wins!";
        } else {
            return "It's a draw!";
        }
        // How does this print the correct form ''


//        if (card1.getCardValue() > card2.getCardValue()) {
//            String winnerRank = String.format("%s", card1.getRank());
//            String winnerSuit = String.format("%s", card1.getSuit());
//
////            return winnerRank + " of " +  winnerSuit + " wins!" ;
//            return card1 + "wins!";
//        } else if () {
//
//        }
//
//        if (card2.getCardValue() > card1.getCardValue()) {
//            String winnerRank = String.format("%s", card2.getRank());
//            String winnerSuit = String.format("%s", card2.getSuit());
//
////            return winnerRank + " of " +  winnerSuit + " wins!";
//            return card2 + "wins!";
//        }
//
//        String winnerRank = String.format("%s", card2.getRank());
//        String winnerSuit = String.format("%s", card2.getSuit());
//
////        return winnerRank + " of " +  winnerSuit + " wins!";
//        return "It's a draw!";

    }








}
