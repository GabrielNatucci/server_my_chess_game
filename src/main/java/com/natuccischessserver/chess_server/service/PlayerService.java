package com.natuccischessserver.chess_server.service;

import com.natuccischessserver.chess_server.model.Player;

public interface PlayerService {
    public Player savePlayer(Player player);

    public Player logInPlayerByEmail(String email, String password);

    public Player logInPlayerByName(String name, String password);
}