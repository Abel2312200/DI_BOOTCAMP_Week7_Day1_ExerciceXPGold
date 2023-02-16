import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class DeckOfCards {
    // class attributes
    private List<Card> cards = new ArrayList<>();

    // constructor without parameters
    public DeckOfCards() {
        String[] types = {"Heart", "Clover", "Spade", "Diamond"}; // array of cards types
        Map<String, Integer> titleValueMap = new HashMap<String, Integer>(){{ //
            put("2", 2);
            put("3", 3);
            put("4", 4);
            put("5", 5);
            put("6", 6);
            put("7", 7);
            put("8", 8);
            put("9", 9);
            put("10", 10);
            put("Jack", 10);
            put("Queen", 10);
            put("King", 10);
            put("Ace", 11);
        }}; // HashMap for cards values
        for (int i = 0; i < types.length; i++) {
            int _i = i;
            titleValueMap.forEach((t, v) -> {
                Card card = new Card(v, types[_i], t);
                this.cards.add(card);
            });
        } // for a current card type add all cards values
    }

    // constructor(s) using parameter(s)
    public DeckOfCards(List<Card> cards) {
        this.cards = cards;
    }

    // getters and setters

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    // class methods
    public void getDetails(){
        List<Card> cards1 =  getCards();
        System.out.println(cards1.toString());
    }

}

