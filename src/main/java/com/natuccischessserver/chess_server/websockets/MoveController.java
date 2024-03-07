package com.natuccischessserver.chess_server.websockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MoveController {

    @MessageMapping
    @SendTo("topic/msg")
    public Move move(Move move) {
        return new Move(1, "e4");
    }
}
