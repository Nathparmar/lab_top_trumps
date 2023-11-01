package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
@Service
public class TopTrumpsService {


    public String checkWinner(ArrayList<Card> cards) {


        if (cards.get(0).getCardValue() > cards.get(1).getCardValue()) {
            return "Card1 wins";
        } else {
            return "Card2 wins";
        }

    }


}
