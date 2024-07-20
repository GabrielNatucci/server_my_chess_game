package com.natuccischessserver.chess_server.websockets;

import java.util.ArrayList;

import com.natuccischessserver.chess_server.model.Player;

public class Move {
    private Player player;
    private ArrayList<Integer> start_square;
    private ArrayList<Integer> end_square;
    private int status;
    private String color;

    public Move(Player player, ArrayList<Integer> start_square, ArrayList<Integer> end_square, int status,
            String color) {
        this.player = player;
        this.start_square = start_square;
        this.end_square = end_square;
        this.status = status;
        this.color = color;
    }

    public Move(int status) {
        this.status = status;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Integer> getStart_square() {
        return start_square;
    }

    public void setStart_square(ArrayList<Integer> start_square) {
        this.start_square = start_square;
    }

    public ArrayList<Integer> getEnd_square() {
        return end_square;
    }

    public void setEnd_square(ArrayList<Integer> end_square) {
        this.end_square = end_square;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
