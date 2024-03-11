package com.natuccischessserver.chess_server.model;

public class PlayerRest {
    private String name;
    private String authtoken;

    public PlayerRest(String authtoken, String name) {
        this.authtoken = authtoken;
        this.name = name;
    }

    public PlayerRest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthtoken() {
        return authtoken;
    }

    public void setAuthtoken(String authToken) {
        this.authtoken = authToken;
    }
}
