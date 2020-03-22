package com.codecool.app;

import java.util.Comparator;

public class UserScoreComparator implements Comparator<Card>{

    @Override
    public int compare(Card firstCard, Card secondCard) {
        return Integer.compare(firstCard.getUserScore(), secondCard.getUserScore());
    }
}