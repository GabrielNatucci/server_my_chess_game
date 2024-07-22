package com.natuccischessserver.chess_server.model;

import java.util.ArrayList;

/**
 * QueueModel
 */
public class QueueModel {
    private ArrayList<Player> players_waiting;

	public QueueModel(ArrayList<Player> players_waiting) {
		this.players_waiting = players_waiting;
	}

	public ArrayList<Player> getPlayers_waiting() {
		return players_waiting;
	}

	public void setPlayers_waiting(ArrayList<Player> players_waiting) {
		this.players_waiting = players_waiting;
	}
}
