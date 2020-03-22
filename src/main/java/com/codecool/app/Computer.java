package com.codecool.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Computer extends Player {

    TreeMap<Integer, String> calculatedAttributes = new TreeMap<Integer, String>();

    public Computer(List<Card> cards) {
        super(cards);
        name = "Computer";
        calculateBestAttribute();
    }

    public void calculateBestAttribute() {
        Card actualCard = this.getHand().passCard();
        int maxScore = 100;
        int maxNumberOfCopies = 1200;
        int maxIncome = 8000;

        int metaScorePercent = actualCard.getMetascore() * 100 / maxScore;
        int userScorePercent = actualCard.getUserScore() * 100 / maxScore;
        int numberOfCopiePercent = actualCard.getNumberOfCopies() * 100 / maxNumberOfCopies;
        int incomePercent = actualCard.getOpeningMonthIncome() * 100 / maxIncome;

        calculatedAttributes.put(metaScorePercent, "metascore");
        calculatedAttributes.put(userScorePercent, "userScore");
        calculatedAttributes.put(numberOfCopiePercent, "numberOfCopies");
        calculatedAttributes.put(incomePercent, "openingMonthIncome");
    }

    public int getInputFromComputer(){
        String bestAttribute = calculatedAttributes.lastEntry().getValue();
        int computerChoice;
        if(bestAttribute.equals("metascore")){
            return computerChoice = 1;
        }
        else if(bestAttribute.equals("userScore")){
            return computerChoice = 2;
        }
        else if(bestAttribute.equals("numberOfCopies")){
            return computerChoice = 3;
        }else{
            return computerChoice = 4;
        }
    }
    
}
