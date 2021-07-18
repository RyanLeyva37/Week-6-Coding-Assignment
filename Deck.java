package com.promineo.ryanleyva1.week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards;

    /**
     * Creates a standard 52-card deck
     */
    public Deck() {
        this.cards = createCards();
    }

    /**
     * Shuffles the deck using the Random.nextInt method
     */
    public void shuffle() {
        Random random = new Random();
        List<Card> newCards = new ArrayList<Card>();
        while (this.cards.isEmpty() == false) {
            int pos = random.nextInt(this.cards.size());
            newCards.add(this.cards.get(pos));
            this.cards.remove(pos);
        }
        this.cards = newCards;
    }

    /**
     * Draws the first card from the deck
     * @return first card from deck
     */
    public Card draw() {
        return this.cards.remove(0);
    }

    /**
     * Prints all cards in the current deck to
     * the console
     */
    public void printDeck() {
        System.out.println("Printing " + this.cards.size() + " cards");
        for (Card card : this.cards) {
            card.describe();
        }
    }

    /**
     * Creates 52 new Card instances for each card in a
     * standard 52-card deck
     * @return list of all cards created
     */
    private List<Card> createCards() {
        List<Card> newCards = new ArrayList<Card>();
        for (int i = 1; i < 14; i++) {
            newCards.add(new Card(i, "Clubs"));
            newCards.add(new Card(i, "Diamonds"));
            newCards.add(new Card(i, "Hearts"));
            newCards.add(new Card(i, "Spades"));

        }

        return newCards;
    }


}
