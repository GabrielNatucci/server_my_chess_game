package com.natuccischessserver.chess_server.service;

import com.natuccischessserver.chess_server.model.Player;

public interface PlayerService {
    public Player savePlayer(Player p);

    public Player updatePlayerAuthToken(Player p);

    public Player logInPlayerByEmail(String email, String password);

    public Player logInPlayerByName(String name, String password);

    public Player logInPlayerByNameOrEmail(String name, String email, String password);

    public Player logInPlayerByAuthtoken(String name, String authtoken);
}
