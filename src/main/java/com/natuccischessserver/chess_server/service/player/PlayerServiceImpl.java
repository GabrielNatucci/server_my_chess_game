package com.natuccischessserver.chess_server.service.player;

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
        if (p.getEmail() == "" || p.getPassword() == "" || p.getName() == ""
                || playerRepository.findPlayerByEmail(p.getEmail()).size() != 0
                || playerRepository.findPlayerByName(p.getName()).size() != 0) {
            return null;
        } else {
            return playerRepository.save(p);
        }
    }

    @Override
    public Player logInPlayerByEmail(String email, String password) {
        return playerRepository.findPlayerByEmailAndPassword(email, password);
    }

    @Override
    public Player logInPlayerByName(String name, String password) {
        return playerRepository.findPlayerByNameAndPassword(name, password);
    }
}
