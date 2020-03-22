package com.codecool.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CSVCardDao implements CardDao {
    private List<Card> cards = new ArrayList<Card>();

    // private ArrayList<String[]> cardList = new ArrayList<String[]>();
    @Override
    public List<Card> getCardFromFile() throws FileNotFoundException {
        try{
            File file = new File("src/main/resources/games.csv");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {

                String[] line = scan.nextLine().split(", ");
                String name = line[0];
                int metascore = Integer.parseInt(line[1]);
                int userScore = Integer.parseInt(line[2]);
                int numberOfCopies = Integer.parseInt(line[3]);
                int openingMonthIncome = Integer.parseInt(line[4]);
                Card card = new Card(name, metascore, userScore, numberOfCopies, openingMonthIncome);
                cards.add(card);
            }
            scan.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File doesn't exist");
        }
        return cards;
    }
}