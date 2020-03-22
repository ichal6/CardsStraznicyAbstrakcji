package com.codecool.app;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ComputerTest {
    TreeMap<Integer, String> calculatedAttributes = new TreeMap<Integer, String>();
    ArrayList<Card> tempLista = new ArrayList<Card>();


    public void create_card_list() {
        Card card = new Card("Darek", 10, 2, 3, 100);
        Card card2 = new Card("Marek", 2, 3, 3, 3);
        tempLista.add(card);
//        tempLista.add(card2);
    }

    @Test
    public void should_return_card_best_attribute() {
        //given
        create_card_list();
        Computer computer = new Computer(tempLista);
        int expected = 4;
        //when
        int result = computer.getInputFromComputer();
        //then
        Assert.assertEquals(expected, result);
    }

}