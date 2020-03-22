package com.codecool.app;

import java.util.List;
import java.util.Scanner;

public class Gamer extends Player {

    public int playerChoice;
    Scanner scan = new Scanner(System.in);

    public Gamer(List<Card> cards){
        super(cards);
    }

    public String getNameFromUser(){
        String dupa = scan.nextLine();
        return dupa;
    }

    public int getInput(){
        playerChoice = scan.nextInt();
        while(playerChoice < 1 || playerChoice > 4){
            System.out.println("Podaj liczbe od 1 do 4");
            playerChoice = scan.nextInt();
        }
        return playerChoice;
    }
   
}