package com.natuccischessserver.chess_server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.natuccischessserver.chess_server.model.ChessGame;

@Controller
@RequestMapping("/game")
public class ChessGameController {
    @PostMapping("/add")
    ResponseEntity<String> add(@RequestBody ChessGame game) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
