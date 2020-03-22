package com.codecool.app;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {


    Card card = new Card("Darek", 1,2, 2, 2);
    Card card2 = new Card("Marek", 2,3, 3, 3);

    @Test
    public void should_return_name() {
        //given
        String expected = "Darek";
        //when
        String name = card.getName();
        //then
        assertEquals(expected, name);
    }

    @Test
    public void should_return_metascore() {
        //given
        int expected = 1;
        // when
        int metascore = card.getMetascore();
        //then
        assertEquals(expected, metascore );
    }

    @Test
    public void should_weaker_card_return_negative_result() {
        int result = card.compareTo(card2);
        //then
        Assert.assertTrue(result < 0);
    }

    @Test
    public void should_stronger_card_return_positive_result() {
        int result = card2.compareTo(card);
        //then
        Assert.assertTrue(result > 0);
    }

    @Test
    public void should_equal_card_return_zero_result() {
        int result = card2.compareTo(card2);
        //then
        Assert.assertTrue(result == 0);
    }

    @Test
    public void should_method_equals_true() {
        boolean expected = true;
        //when
        boolean result = card2.equals(card2);
        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_method_equals_false() {
        boolean expected = false;
        //when
        boolean result = card.equals(card2);
        //then
        Assert.assertEquals(expected, result);
    }
}