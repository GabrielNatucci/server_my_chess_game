package com.natuccischessserver.chess_server.service.chess_game;

import com.natuccischessserver.chess_server.model.ChessGame;

public interface ChessGameService {
    public ChessGame saveChessGame(ChessGame game);

    public ChessGame editExistingChessGame(ChessGame game);
}
