package com.codecool.app;

import java.util.Comparator;

public class OpeningMonthIncomeComparator implements Comparator<Card> {

    @Override
    public int compare(Card firstCard, Card secondCard) {
        return Integer.compare(firstCard.getOpeningMonthIncome(), secondCard.getOpeningMonthIncome());
    }

}