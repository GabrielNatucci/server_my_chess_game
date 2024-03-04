package com.natuccischessserver.chess_server.service;

import com.natuccischessserver.chess_server.model.Player;

public interface PlayerService {
    public Player savePlayer(Player player);

    public Player logInPlayer(String email, String password);
}