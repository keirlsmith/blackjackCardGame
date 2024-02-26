/*** Keir Smith
     02/25/2024
     Video Link: https://drive.google.com/file/d/1WRlS-2lDPXVMCQ8S1A9PaV3bpKP8aV7u/view
**/

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
// 		Card myCard = new Card();
// 		myCard.setCardSuit("My card suit");
// 		myCard.setCardValue("My card value");
		
// 		System.out.print(myCard.getCardValue() + ", ");
// 		System.out.print(myCard.getCardSuit());
		
// 		Card mySecondCard = new Card("My second card value", "My second Card's suit");
		
// 		System.out.println();
// 		System.out.print(mySecondCard.getCardValue() + ", ");
// 		System.out.print(mySecondCard.getCardSuit());
		
		
		DeckOfCards myCardDeck = new DeckOfCards();
		
// 		for (int i = 0; i < 5; i++) {
// 		    System.out.print(myCardDeck.getAndRemoveCardFromDeck().getCardValue() + " of ");
// 		    System.out.println(myCardDeck.getAndRemoveCardFromDeck().getCardSuit());
// 		}

        Hand myHand = new Hand();
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter number of cards per hand: ");
        int num = scnr.nextInt();
        
        for (int i = 0; i < num; i++) {
            Card card = myCardDeck.getAndRemoveCardFromDeck();
            myHand.addACardToHand(card);
        }
        myHand.showAllCards();
        
        //For sum of card values in Hand
        int total = myHand.handTotal(); //calls handTotal method
        System.out.println("");
        System.out.println("Sum of hand values: " + total);
        
        scnr.close();
    }
}