package com.promineo.ryanleyva1.week6;

public class Card {

    private int value;

    private String name;

    /**
     * Creates a new card with the value and name passed in
     * @param value number of card
     * @param name suit of card
     */
    public Card(int value, String name){
        this.value = value;
        this.name = name;
    }

    /**
     * Returns number of card
     * @return number of card
     */
    public int getValue(){
        return value;
    }

    /**
     * Sets value of card.
     * included to meet project requirements (Constructor is more efficient)
     * @param value
     */
    public void setValue(int value){

        this.value = value;
    }

    /**
     * Returns suit of card
     * included to meet project requirements (getFullName is more efficient)
     * @return suit of card
     */
    public String getName(){
        return this.name;
    }

    /**
     * Sets name of card
     * included to meet project requirements (Constructor is more efficient)
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Returns the number of the card as well as the suit in String format
     *
     * @return full
     */
    public String getFullDescription(){
        String suit = this.name;
        String valueToString = this.valueToString();

        return valueToString + " of " + suit;

    }

    /**
     * Prints full description to console
     * @see #getFullDescription()
     */
    public void describe(){
        System.out.println(this.getFullDescription());
    }

    /**
     * Converts the interger value of the card to the proper description for said value
     * @return name of value
     */
    private String valueToString(){

        switch(value){
            case 1 :
                return "Ace";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "Invalid Number";

        }

    }

}
