package com.natuccischessserver.chess_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natuccischessserver.chess_server.model.Player;
import com.natuccischessserver.chess_server.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @PostMapping("/add")
    public String add(@RequestBody Player player) {
        playerService.savePlayer(player);
        return "Novo player adicionado ao banco de dados";
    }
}