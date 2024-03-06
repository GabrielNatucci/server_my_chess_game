package com.natuccischessserver.chess_server.service.chess_game;

import com.natuccischessserver.chess_server.model.ChessGame;
import com.natuccischessserver.chess_server.repository.ChessGameRepository;

public class ChessGameServiceImpl implements ChessGameService {
    private ChessGameRepository chess_game_repo;

    @Override
    public ChessGame saveChessGame(ChessGame game) {
        return chess_game_repo.save(game);
    }

    @Override
    public ChessGame editExistingChessGame(ChessGame game) {
        return null;
    }
}