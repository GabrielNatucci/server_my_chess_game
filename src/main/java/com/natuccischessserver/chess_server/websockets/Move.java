package com.natuccischessserver.chess_server.websockets;

import com.natuccischessserver.chess_server.model.Player;

public class Move {
    private Player player;
    private String move_str;
    private String color;

    public Move(Player player, String move_str, String color) {
        this.player = player;
        this.move_str = move_str;
        this.color = color;
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

    public void setMove_str(String move_str) {
        this.move_str = move_str;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}