package com.example.top_trumps_start_code.service;


import com.example.top_trumps_start_code.models.Card;
//import com.example.top_trumps_start_code.models.Deck;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class TopTrumpsService {

    private Rank rank;
    private Suit suit;
    private Card card;
    private ArrayList<Card> deck;

    public TopTrumpsService() {

    }

    public String checkWinner(Card card1, Card card2) {

        this.playRound(deck);

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

    public void initializeDeck() {
        deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(deck);
    }



    public String startNewGame() {
        initializeDeck();
//        System.out.println(deck.size());
        return "Let's start a new game";
    }

    public String playRound(ArrayList<Card> cards) {
        if (cards.size() != 2) {
            return " Get two cards";
        }

        // add remove card function here
//        if (!deck.contains(card1) || !deck.contains(card2)) {
//            return "Invalid cards provided. Please play with cards from the current deck.";
//        }

//        deck.remove(card1);
//        deck.remove(card2);

        // call method  - maybe in controller not here
//        this.checkWinner(card1, card2);

        return "Invalid";
    }











}
