
public class Card {
    //attributes for each card
    private String cardValue;
    private String cardSuit;
    
    //getters and setters
    public String getCardSuit() {
        return this.cardSuit;
    }
    
    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }
    
    //****************************************
    public String getCardValue() {
        return this.cardValue;
    }
    
    public void setCardValue(String cardValue) {
        this.cardValue = cardValue;
    }
    
    //********Constructors*******************
    
    Card() {
        System.out.println("No-arg constructor Called");
    }
    
    
    Card(String cardValue, String cardSuit) {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
    }
}