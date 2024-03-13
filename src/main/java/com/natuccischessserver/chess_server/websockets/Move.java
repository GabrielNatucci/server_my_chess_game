package com.natuccischessserver.chess_server.websockets;

import com.natuccischessserver.chess_server.model.Player;

public class Move {
    private Player player;
    private String move_str;

    public Move(Player player, String move) {
        this.player = player;
        this.move_str = move;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getMove_str() {
        return move_str;
    }

    public void setMove_str(String move) {
        this.move_str = move;
    }
}