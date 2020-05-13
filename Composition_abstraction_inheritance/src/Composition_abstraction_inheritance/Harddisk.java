package Composition_abstraction_inheritance;
class Harddisk extends Card {
    
   private int reading_speed;
   private int writing_speed;
   private Programs programs;
    
   public Harddisk(String name, String cardtype, int storage_capacity, int reading_speed, int writing_speed, Programs programs) {
        super(name, cardtype, storage_capacity);
        this.reading_speed =reading_speed;
        this.writing_speed= writing_speed;
        this.programs =programs;
    }

    public int getReading_speed() {
        return reading_speed;
    }
    public void setReading_speed(int reading_speed) {
        this.reading_speed = reading_speed;
    }
    public int getWriting_speed() {
        return writing_speed;
    }
    public void setWriting_speed(int writing_speed) {
        this.writing_speed = writing_speed;
    }
    public Programs getPrograms() {
        return programs;
    }
    public void setPrograms(Programs programs) {
        this.programs = programs;
    }
}


