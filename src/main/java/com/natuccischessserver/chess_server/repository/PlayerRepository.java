package com.natuccischessserver.chess_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.natuccischessserver.chess_server.model.Player;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    public Player findPlayerByEmailAndPassword(String email, String Password);

    public Player findPlayerById(int id);

    public Player findPlayerByNameAndPassword(String name, String Password);

    public Player findPlayerByNameOrEmailAndPassword(String name, String email, String password);

    public Player findPlayerByNameAndAuthtoken(String name, String authtoken);

    public List<Player> findPlayerByEmail(String email);

    public List<Player> findPlayerByName(String name);
}
