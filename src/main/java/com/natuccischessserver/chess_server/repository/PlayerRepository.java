package com.natuccischessserver.chess_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.natuccischessserver.chess_server.model.Player;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    public Player findPlayerByEmailAndPassword(String email, String Password);

    public List<Player> findPlayerByEmail(String email);
}