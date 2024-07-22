package com.natuccischessserver.chess_server.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.natuccischessserver.chess_server.model.Player;
import com.natuccischessserver.chess_server.model.QueueModel;

/**
 * QueueServiceImpl
 */
@Service
public class QueueServiceImpl {

    private ArrayList<Player> players;

    public ArrayList<Player> queueAdd(Player p) {
        if (players == null) {
            players = new ArrayList<Player>();
        }

        this.addPlayer(p);

        return this.players;
    }

    public boolean queueRemove(Player p, Player p2) {
        int countRemoved = 0;

        for (Player player : players) {
            if (player.getId() == p.getId()) {
                players.remove(player);
                countRemoved += 1;
            }

            if (player.getId() == p2.getId()) {
                players.remove(player);
                countRemoved += 1;
            }
        }

        if (countRemoved == 2) {
            return true;
        }

        return false;
    }

    public ArrayList<Player> verifyPossiblePair(QueueModel q) {
        return null;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public int getPlayersLength(Player p) {
        return players.size();
    }
}

