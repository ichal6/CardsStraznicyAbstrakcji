package com.codecool.app;


import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Comparator;

public class Table {

    int roundNumber = 1;
    int choice;

//    CardDao cardDao = new CSVCardDao();
    CardDao cardDao = new XMLCardDao();
    Deck deck = new Deck(cardDao.getCardFromFile());
    Gamer gamer = new Gamer(deck.getGamerCards());
    Computer computer = new Computer(deck.getComputerCards());

    Hand gamerHand = gamer.getHand();
    Hand computerHand = computer.getHand();
    View view = new View();

    public Table() throws IOException, ParserConfigurationException, SAXException {

    }

    public Comparator<Card> createComparator() {

        Comparator<Card> comparator = null;

        if (roundNumber % 2 == 0) {
            choice = computer.getInputFromComputer();
        } else {
            choice = gamer.getInput();
        }

        switch (choice) {
            case 1:
                comparator = new MetascoreComparator();
                return comparator;
            case 2:
                comparator = new UserScoreComparator();
                return comparator;
            case 3:
                comparator = new NumberOfCopiesComparator();
                return comparator;
            case 4:
                comparator = new OpeningMonthIncomeComparator();
                return comparator;
        }
        return comparator;
    }

    public void playRound() throws IOException {

        Card playerCard = gamer.getHand().passCard();
        Card computerCard = computer.getHand().passCard();

        view.displayGameInfo(gamer, computer);
        view.displayCardAttributes(playerCard);

        Comparator<Card> comparator = createComparator();
        int result = comparator.compare(playerCard, computerCard);


        view.displayChosenAttribure(playerCard, computerCard, choice);

        view.displayRoundResult(result);

        addPoints(result);
        gamerHand.removeCard();
        computerHand.removeCard();
        roundNumber++;
        view.clearScreen();
    }


    public void addPoints(int result){
        if(result > 0){
            gamer.setPoints();
        }else if(result < 0){
            computer.setPoints();
        }
    }


    public void playGame() throws IOException {

        view.displayHelloMessage();
        gamer.setName(gamer.getNameFromUser());
        view.clearScreen();

        while(!(gamer.getHand().getCards().isEmpty())){
            playRound();
        }
        view.displayGameInfo(gamer, computer);
        view.displayGameWinner(gamer, computer);
    }
}