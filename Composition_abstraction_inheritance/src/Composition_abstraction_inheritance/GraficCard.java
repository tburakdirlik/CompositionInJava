package Composition_abstraction_inheritance;


public class GraficCard extends Card {
    
    private int speed;

    public GraficCard(String name, String cardtype, int storage_capacity, int speed) {
        super(name, cardtype, storage_capacity);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}



