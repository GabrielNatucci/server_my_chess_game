package com.natuccischessserver.chess_server.websockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MoveController {
    @MessageMapping("/move")
    @SendTo("/move_resp")
    public Move move(Move move) throws Exception {
        System.out.println(move);
        System.out.println(move.getMove_str());
        return new Move(move.getPlayer(), move.getMove_str());
    }
}
