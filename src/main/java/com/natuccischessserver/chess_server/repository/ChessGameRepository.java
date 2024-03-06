package com.natuccischessserver.chess_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.natuccischessserver.chess_server.model.ChessGame;

@Repository
public interface ChessGameRepository extends JpaRepository<ChessGame, Integer> {

}
