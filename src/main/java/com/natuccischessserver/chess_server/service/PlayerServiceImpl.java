package com.natuccischessserver.chess_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.natuccischessserver.chess_server.model.Player;
import com.natuccischessserver.chess_server.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player savePlayer(Player p) {
        if (p.getEmail() == "" || p.getPassword() == ""
                || playerRepository.findPlayerByEmail(p.getEmail()).size() != 0) {
            return null;
        } else {
            return playerRepository.save(p);
        }
    }

    @Override
    public Player logInPlayer(String email, String password) {
        return playerRepository.findPlayerByEmailAndPassword(email, password);
    }
}
