package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
@Service
public class TopTrumpsService {


    public String checkWinner(ArrayList<Card> cards) {
        Card card1 = cards.get(0);
        Card card2 = cards.get(1);

        if (card1.getCardValue() > card2.getCardValue()) {
            return String.format("%s of %s wins!", card1.getRank(), card1.getSuit());
        } else if (card1.getCardValue() < card2.getCardValue()){
            return String.format("%s of %s wins!", card2.getRank(), card2.getSuit());
        } else {
            return "It's a draw!";
        }

    }


}
