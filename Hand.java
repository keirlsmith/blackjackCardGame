import java.util.ArrayList;

public class Hand {
    
     //Attributes
    private ArrayList<Card> receivedCards = new ArrayList<Card>();
    private String cardValue;
    private String cardSuit;
    
   
    //Getters and Setters
    public ArrayList<Card> getAllReceivedCards() {
        return this.receivedCards;
    }
    
    public void setAllReceivedCards(ArrayList<Card> receivedCards) {
        this.receivedCards = receivedCards;
    }
    
    public void addACardToHand(Card card) {
        receivedCards.add(card);
    }
    
    public void showAllCards() {
        System.out.println("");
        System.out.println("Cards in Hand:");
        System.out.println("");
        for (int i = 0; i < receivedCards.size(); i++) {
            Card card = receivedCards.get(i);
            cardValue = card.getCardValue();
            cardSuit = card.getCardSuit();
            System.out.println(cardValue + " of " + cardSuit);
        }
    }
    
    public int handTotal() {
        int sumOfAllCards = 0;
        int aceTotal = 0;
        int num = 0;
        String str = "";
        
        for (int i = 0; i < receivedCards.size(); i++) {
            try {
                str = receivedCards.get(i).getCardValue().strip();
                num = Integer.parseInt(str); //Convert value to integer
                
                sumOfAllCards += num;
            } catch (NumberFormatException e) {
                if (str.equalsIgnoreCase("Jack") || str.equalsIgnoreCase("Queen") || str.equalsIgnoreCase("King")) {
                    sumOfAllCards += 10;
                } else {
                    aceTotal++;
                }
            }
        }
            
        //********************************************************
        
        for (int i = 0; i < aceTotal; i++) {
            if (sumOfAllCards + 11 <= 21) {
                sumOfAllCards += 11;
            } else {
                sumOfAllCards += 1;
            }
        }
        
        return sumOfAllCards;
    }
    
}