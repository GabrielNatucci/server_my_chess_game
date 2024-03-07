package com.natuccischessserver.chess_server.websockets;

public class Move {
    private int player_id;
    private String move;

    public Move(int player_id, String move) {
        this.player_id = player_id;
        this.move = move;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }
}
