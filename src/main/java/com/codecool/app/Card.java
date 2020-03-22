package com.codecool.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card implements Comparable<Card> {
    private String name;
    private int metascore;
    private int userScore;
    private int numberOfCopies;
    private int openingMonthIncome;


    public Card(String name, int metascore, int userScore, int numberOfCopies, int openingMonthIncome){
        this.name = name;
        this.metascore = metascore;
        this.userScore = userScore;
        this.numberOfCopies = numberOfCopies;
        this.openingMonthIncome = openingMonthIncome;
        
    }

    public String getName(){
        return name;
    }

    public int getMetascore(){
        return metascore;
    }

    public int getUserScore(){
        return userScore;
    }

    public int getNumberOfCopies(){
        return numberOfCopies;
    }

    public int getOpeningMonthIncome(){
        return openingMonthIncome;
    }

    @Override
    public int compareTo(Card secondCard) {

        int result;

        result = this.metascore - secondCard.metascore;
            
        if(result > 0){
            System.out.println("Karta pierwsza jest wyzsza");
            return result;

        }if(result < 0){
            System.out.println("Karta druga jest wyzsza");
            return result;
        }
            else{

            result = this.userScore - secondCard.userScore;
            if(result > 0){
                System.out.println("Karta pierwsza jest wyzsza");
                return result;
    
            }if(result < 0){
                System.out.println("Karta druga jest wyzsza");
                return result;
            }
                else{
                    result = this.numberOfCopies - secondCard.numberOfCopies;
                if(result > 0){
                    System.out.println("Karta pierwsza jest wyzsza");
                    return result;
        
                }if(result < 0){
                    System.out.println("Karta druga jest wyzsza");
                    return result;
                }
                    else{
                        result = this.openingMonthIncome - secondCard.openingMonthIncome;
                        if(result > 0){
                            System.out.println("Karta pierwsza jest wyzsza");
                            return result;
                
                        }if(result < 0){
                            System.out.println("Karta druga jest wyzsza");
                            return result;
                        }
                            else{
                                System.out.println("KARTY SA TAKIE SAME, ALE JAJA!");
                                return result;
                            }
                    }
                }
            }
        }
    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        else if(obj instanceof Card){
            Card secondCard = (Card) obj;
            if(this.getName().equals(secondCard.getName())){
                System.out.println("Nazwy sa equal.");
            }
        }



        return false;
    }    
    }

    //     int result = 0;
    //     List<Integer> firstCardAttribute = Arrays.asList(this.metascore,this.userScore,this.numberOfCopies,this.openingMonthIncome);
    //     List<Integer> secondCardAttribute = Arrays.asList(secondCard.metascore,secondCard.userScore, secondCard.numberOfCopies, secondCard.openingMonthIncome);
       
    //     int index = 0;
    //     while(index < firstCardAttribute.size()){
    //         result = firstCardAttribute.get(index) - secondCardAttribute.get(index);
    //     if(result > 0){
    //         System.out.println("pierwsza karta lepsza");   
    //         return result;
    //     }
    //     else if(result < 0){
    //         System.out.println("druga karta wyzsza");
    //         return result;
    //     }
    //     else{
    //         index++;
    //         if(index == 4){
    //             System.out.println("Cards are equal.");
    //         }
    //     }
    //     }
    //     return result;
    // }




