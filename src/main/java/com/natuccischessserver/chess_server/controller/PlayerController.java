package com.natuccischessserver.chess_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.natuccischessserver.chess_server.model.Player;
import com.natuccischessserver.chess_server.service.PlayerService;
import com.natuccischessserver.chess_server.token.Token;

@RestController
@RequestMapping("/player")
@CrossOrigin
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @PostMapping("/add")
    ResponseEntity<String> add(@RequestBody Player p) {
        if (playerService.savePlayer(p) == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @PostMapping("/login")
    ResponseEntity<String> logInPlayer(@RequestBody Player p) {
        // se o jogador errar a senha ou se não tiver o username ou o email dele
        // registrado
        if (playerService.logInPlayerByNameOrEmail(p.getName(), p.getEmail(), p.getPassword()) == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        // resposta OK, ou seja, o usuário acertou a senha
        // gera o token de autenticação para o usuário não precisar ficar logando todo
        // dia
        p = playerService.logInPlayerByName(p.getName(), p.getPassword());
        p.setAuthtoken(Token.generateNewToken());
        playerService.updatePlayerAuthToken(p);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("authtoken", p.getAuthtoken());
        playerService.savePlayer(p);

        return new ResponseEntity<>(responseHeaders, HttpStatus.OK);
    }
}