package com.example.top_trumps_start_code.controllers;


import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.services.TopTrumpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/topTrumps") // localhost:8080/topTrumps
public class TopTrumpsController {

    @Autowired
    TopTrumpsService topTrumpsService;

    @PostMapping // GET localhost:8080/topTrumps
    public String newGame(@RequestBody ArrayList<Card> cards) {
        return topTrumpsService.checkWinner(cards);
    }









}
