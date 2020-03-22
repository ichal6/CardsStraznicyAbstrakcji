package com.codecool.app;

import java.util.List;

public class Player {

    protected String name;
    private Hand hand;
    private int points = 0;


    public Player(List<Card> cards){
        this.hand = new Hand(cards);
    }

    public String getName(){
        return name;
    }

    public Hand getHand(){
        return hand;
    }

    public int getPoints(){
        return points;
    }

    public void setPoints(){
        points++;
    }

    public void setName(String playerName){
        this.name = playerName;
    }
}