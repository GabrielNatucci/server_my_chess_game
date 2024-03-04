package com.natuccischessserver.chess_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natuccischessserver.chess_server.model.Player;
import com.natuccischessserver.chess_server.service.PlayerService;

@RestController
@RequestMapping("/player")
@CrossOrigin
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @PostMapping("/add")
    public String add(@RequestBody Player player) {
        if (playerService.savePlayer(player) == null) {
            return "Jogador não adicionado";
        } else {
            return "Novo player adicionado ao banco de dados";
        }
    }

    @GetMapping("/login")
    public String logInPlayer(@RequestBody Player p) {
        if (playerService.logInPlayer(p.getEmail(), p.getPassword()) == null) {
            return "Não achei você";
        } else {
            return "Achei vc";
        }
    }
}
