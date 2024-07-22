package com.natuccischessserver.chess_server.service;

import java.util.ArrayList;

import com.natuccischessserver.chess_server.model.Player;
import com.natuccischessserver.chess_server.model.QueueModel;

/**
 * QueueService
 */
public interface QueueService {
    public QueueModel queueAdd(Player p);

    public boolean queueRemove(Player p, Player p2);

    public ArrayList<Player> verifyPossiblePair(QueueModel q);
}
