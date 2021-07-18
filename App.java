/**
 * The App program implements an applications that
 * simulates a game of "War" being played by two players.
 *
 * @author Ryan Leyva
 * @version 1.0
 * @since 2021-7-143
 */
package com.promineo.ryanleyva1.week6;

public class App {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player playerOne = new Player("Peter Juan");   //Instantiated a new deck and both players
        Player playerTwo = new Player("Payter Sue"); // Implement scanner

        deck.shuffle(); //Shuffles deck

        System.out.println("--------Deck Description--------");
        deck.printDeck();

        distributeCards(deck, playerOne, playerTwo); // Distributes 26 cards to each player

        System.out.println("--------Player One Description--------");

        playerOne.describe();

        System.out.println("--------Player Two Description--------");

        playerTwo.describe();

        simulateGame(playerOne, playerTwo);

        System.out.println("--------Final Scores--------");

        System.out.println("Final Score:");
        System.out.println(playerOne.getName() + ": " + playerOne.getScore());
        System.out.println(playerTwo.getName() + ": " + playerTwo.getScore());
        boolean playerOneWon = playerOne.getScore() > playerTwo.getScore();
        if (playerOne.getScore() == playerTwo.getScore()) {
            System.out.println("Draw! The scores are tied!");
        } else if (playerOneWon) {
            System.out.println("Player 1 (" + playerOne.getName() + ") Won!");
        } else {
            System.out.println("Player 2 (" + playerTwo.getName() + ") Won!");
        }

    }


    /**
     * Simulates 26 player turns, each turn both players draw one card.
     * The value of both drawn cards are compared and a point is awarded
     * to the player with the higher value card.
     *
     * @param  playerOne  the first player participating in the game
     * @param  playerTwo the second player participating in the game
     */
    public static void simulateGame(Player playerOne, Player playerTwo) {
        for (int i = 0; i <= 25; i++) {
            Player winner = null;
            int valueOne = playerOne.flip().getValue();
            int valueTwo = playerTwo.flip().getValue();
            if (valueOne == valueTwo) {
                continue;
            } else if (valueOne > valueTwo) {
                winner = playerOne;
            } else if (valueOne < valueTwo) {
                winner = playerTwo;
            }

            winner.incrementScore();
        }
    }

    /**
     * Distributes 26s card to each player out of the deck of cards
     * passed into the method
     * One card is given to each player until all cards have been distributed
     * Does not distribute all 26 cards at one time
     *
     * @param  deck  deck of cards to be distributed
     * @param  playerOne  the first player participating in the game
     * @param  playerTwo the second player participating in the game
     */
    public static void distributeCards(Deck deck, Player playerOne, Player playerTwo) {
        for (int i = 0; i <= 51; i++) { // Distributes  26 players to each player
            if (i % 2 == 0) {
                playerOne.draw(deck);
            } else {
                playerTwo.draw(deck);
            }
        }
    }


}
