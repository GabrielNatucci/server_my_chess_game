package com.natuccischessserver.chess_server.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "chess_game")
public class ChessGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player white_player;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player black_Player;

    @Column(nullable = false, length = 5)
    private String who_won;
}