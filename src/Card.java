
public class Card {

    // class attributes
    private int value;

    private String type;

    private String title;

    // constructor without parameters
    public Card() {
        super();
    }

    // constructor(s) using parameter(s)
    public Card(int value, String type, String title) {
        this.value = value;
        this.type = type;
        this.title = title;
    }

    // getters and setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // class methods
    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                "} \n";
    }
}