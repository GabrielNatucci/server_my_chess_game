package com.natuccischessserver.chess_server.websockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MoveController {
    @MessageMapping("/move")
    @SendTo("/move_resp")
    public Move move(Move move) throws Exception {
        // remove os " " da string
        String move_str = move.getMove_str().replaceAll("\\s", "");

        // retorna o movimento pra quem tiver inscrito no jogo
        return new Move(move.getPlayer(), move_str, move.getColor());
    }
}