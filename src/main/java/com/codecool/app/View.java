package com.codecool.app;

import java.io.IOException;

public class View {


    public void displayCardAttributes(Card card) {

        System.out.printf("\n\nTwoja obecna karta:");
        System.out.printf(card.getName() + "\n");
        System.out.printf("\n1. Metascore: " + card.getMetascore());
        System.out.printf("\n2. User score: " + card.getUserScore());
        System.out.printf("\n3. Number of copies sold: " + card.getNumberOfCopies());
        System.out.printf("\n4. First month imcome (in milions): " + card.getOpeningMonthIncome());
    }

    public void displayChosenAttribure(Card firstCard, Card secondCard, int choosenAttribute) {
        if (choosenAttribute == 1) {
            System.out.printf("\n\n\nYOU: %1$d  vs OPPONENT: %2$d", firstCard.getMetascore(),
                    secondCard.getMetascore());
        } else if (choosenAttribute == 2) {
            System.out.printf("\n\n\nYOU: %1$d  vs OPPONENT: %2$d", firstCard.getUserScore(),
                    secondCard.getUserScore());
        } else if (choosenAttribute == 3) {
            System.out.printf("\n\n\nYOU: %1$d  vs  OPPONENT: %2$d", firstCard.getNumberOfCopies(),
                    secondCard.getNumberOfCopies());
        } else if (choosenAttribute == 4) {
            System.out.printf("\n\n\nYOU: %1$d  vs  OPPONENT: %2$d", firstCard.getOpeningMonthIncome(),
                    secondCard.getOpeningMonthIncome());
        }
    }

    public void displayHelloMessage() {
        System.out.println("\nHello gamer !\nWelcome to Abstract Defenders Battle of Cards !"+
                "\n\nPlease tell us your name: ");

    }

    public void displayGameWinner(Gamer gamer, Computer computer){
        if(gamer.getPoints()>computer.getPoints()){
            System.out.printf("\n\n%1$s WIN !\n", gamer.getName());
        }
        else if(gamer.getPoints()<computer.getPoints()){
            System.out.printf("\n\n%1$s WIN !\n", computer.getName());
        }
        else{
            System.out.println("\n\nDRAW !\n");
        }
    }

    public void displayGameInfo(Gamer gamer, Computer comp) {
        System.out.printf("\n\n%1$s : %2$s vs %3$s : %4$s", gamer.getName(), gamer.getPoints(), comp.getName(),
                comp.getPoints());
    }

    public void clearScreen() throws IOException {
        System.out.println("\n\nPlease press ENTER to continue...");
        System.in.read();
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    public void displayRoundResult(int result){
        if(result<0){
            System.out.println("\nPlayer 2 won this round !");
        }
        else if(result>0){
            System.out.println("\nPlayer 1 won this round !");
        }
        else{
            System.out.println("\nAtributes are equal.");
        }
    }
}