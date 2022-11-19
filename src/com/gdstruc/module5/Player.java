package com.gdstruc.module5;

import java.util.Objects;

public class Player {


    private int playerId;
    private String userName;
    private int Level;

    public Player(int ID, String name, int level) {
        this.playerId = ID;
        userName = name;
        Level = level;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ID=" + playerId +
                ", Name='" + userName + '\'' +
                ", Level=" + Level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerId == player.playerId && Level == player.Level && Objects.equals(userName, player.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, userName, Level);
    }
}
