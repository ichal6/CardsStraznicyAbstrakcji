package com.codecool.app;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class HandTest {
    Card card = new Card("Darek", 1,2, 2, 2);
    Card card2 = new Card("Marek", 2,3, 3, 3);
    Hand hand;
    List<Card> cards;

    @Test
    public void get_first_card_from_Hand() {
        //given
        fillHand();
        //then
        Assert.assertTrue(hand.passCard() == card);
    }

    @Test
    public void check_Remove_Card() {
        //given
        fillHand();
        ArrayList<Card> cardsAfterRemove = new ArrayList<>();
        cardsAfterRemove.addAll(Arrays.asList(card2));
        //when
        hand.removeCard();
        //then
        Assert.assertEquals(hand.getCards(),cardsAfterRemove);
    }

    private void fillHand(){
        cards = new ArrayList<>();
        cards.addAll(Arrays.asList(card, card2));
        hand = new Hand(cards);
    }
}