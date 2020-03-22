package com.codecool.app;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;

    private List<Card> gamerCards = new ArrayList<Card>();
    private List<Card> computerCards = new ArrayList<Card>();

    public Deck(List<Card> cards){
        this.cards = cards;
        drawCards();
    }

    public void displayCards(){
        for(Card card : cards){
            System.out.println(card.getName());
        }
    }

    private void drawCards(){
        int counter = 0;
        for(Card card : cards){
            if(counter % 2 == 0){
                gamerCards.add(card);
                counter++;
            }else{
                computerCards.add(card);
                counter++;
            }
        }
    }

    public List<Card> getGamerCards(){
        return gamerCards;
    }

    public List<Card> getComputerCards(){
        return computerCards;
    }

}