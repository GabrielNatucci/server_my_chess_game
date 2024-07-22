package com.natuccischessserver.chess_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.natuccischessserver.chess_server.model.Player;
import com.natuccischessserver.chess_server.service.QueueServiceImpl;

/**
 * ChessWaitQueueController
 */
@Controller
public class ChessWaitQueueController {

    @Autowired
    private QueueServiceImpl queue;

    @CrossOrigin
    @MessageMapping("/game_wait")
    public void queueListAdd(Player p) {
        queue.queueAdd(p);
    }

    public void makeTwoPlayerPlay() {
    }
}
