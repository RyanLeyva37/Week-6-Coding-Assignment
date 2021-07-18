package com.promineo.ryanleyva1.week6;

import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand = new ArrayList<Card>();

    private int score = 0;

    private String name = "";

    /**
     * Creates a new player
     *
     * @param name name of the new player
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Outputs the players name and score variables as well as
     * all cards currently in the respective players hand.
     */
    public void describe() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Current Hand (" + hand.size() + ") : ");
        for (Card card : this.hand) {
            card.describe();
        }
    }

    /**
     * Pulls the first card in the players hand to be
     * used for their turn in the game
     *
     * @return first card in players hand
     */
    public Card flip() {
        return this.hand.remove(0);
    }

    /**
     * Draws the first card from the deck of cards being
     * passed into the method and adds it to the players hand
     *
     * @param deck the deck of cards to be drawn from
     */
    public void draw(Deck deck) {
        this.hand.add(deck.draw());
    }

    /**
     * Increments players score by one
     */
    public void incrementScore() {
        this.score++;
    }

    /**
     * Returns the name of the player
     *
     * @return name of player
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the score of the player
     *
     * @return score of player
     */
    public int getScore() {
        return this.getScore();
    }

}
