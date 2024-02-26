import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
import java.io.File;


public class DeckOfCards {
    //Attributes
    private ArrayList<Card> allCards = new ArrayList<Card>();

    
    //Getters and Setters
    public ArrayList<Card> getAllCards(){
        return this.allCards;
    }
    
    public void setAllCards(ArrayList<Card> allCards) {
        this.allCards = allCards;
    }
    
    //Constructor
    
    DeckOfCards ()throws Exception{
        
        fillDeckWithCards();
        shuffleCards();
    }
    
    
    //******Methods****
    public void fillDeckWithCards() throws Exception{
        File file = new File("CardType.txt");
        Scanner extractCardFromFile = new Scanner(file);
        Card createCard;
        
        String strCardInfo = "";
        String[] tempStringArray;
        
        //int count = 0;
    
        while (extractCardFromFile.hasNext()) {
            strCardInfo = extractCardFromFile.nextLine();
            tempStringArray = strCardInfo.split(",");
            createCard = new Card(tempStringArray[0], tempStringArray[1]);
            allCards.add(createCard);
        }
    }
        
    public Card getAndRemoveCardFromDeck() {
        return allCards.remove(0);
    }
    
    public void setACardToDeck(Card singleCard) {
        allCards.add(singleCard);
    }
    
    public void shuffleCards() {
        Collections.shuffle(allCards);
    }
}