
package Composition_abstraction_inheritance;

public class Card {
    
    private String name;
    private String cardtype;
    private int storage_capacity;

    public Card(String name, String cardtype, int storage_capacity) {
        this.name = name;
        this.cardtype = cardtype;
        this.storage_capacity = storage_capacity;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCardtype() {
        return cardtype;
    }
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }
    public int getStorage_capacity() {
        return storage_capacity;
    }
    public void setStorage_capacity(int storage_capacity) {
        this.storage_capacity = storage_capacity;
    }
}


