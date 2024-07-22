package com.natuccischessserver.chess_server.websockets;

import com.natuccischessserver.chess_server.model.Player;
import java.util.ArrayList;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
public class MoveController {

    @CrossOrigin
    @MessageMapping("/move")
    @SendTo("/move_resp")
    public Move move(Move move) throws Exception {
        try {
            ArrayList<Integer> start_square = move.getStart_square();
            ArrayList<Integer> end_square = move.getEnd_square();

            Player player = move.getPlayer();

            player.setAuthtoken("");

            // retorna o movimento pra quem tiver inscrito no jogo
            return new Move(
                player,
                start_square,
                end_square,
                200,
                move.getColor()
            );
        } catch (Exception e) {
            return new Move(200);
        }
    }
}
