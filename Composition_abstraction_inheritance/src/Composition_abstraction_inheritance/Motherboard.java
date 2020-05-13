package Composition_abstraction_inheritance;
public class Motherboard {
    
    private String model;    
    private String producer;
    private int max_ram_capacity;
    private int max_ram_slot_capacity;
    private String supported_ram_type;
    
    public Motherboard(String model, String producer, int max_ram_capacity, int max_ram_slot_capacity, String supported_ram_type) {
        this.model = model;
        this.producer = producer;   
        this.max_ram_capacity = max_ram_capacity;
        this.max_ram_slot_capacity = max_ram_slot_capacity;
        this.supported_ram_type = supported_ram_type;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public int getMax_ram_capacity() {
        return max_ram_capacity;
    }
    public void setMax_ram_capacity(int max_ram_capacity) {
        this.max_ram_capacity = max_ram_capacity;
    }
    public int getMax_ram_slot_capacity() {
        return max_ram_slot_capacity;
    }
    public void setMax_ram_slot_capacity(int max_ram_slot_capacity) {
        this.max_ram_slot_capacity = max_ram_slot_capacity;
    }
    public String getSupported_ram_type() {
        return supported_ram_type;
    }
    public void setSupported_ram_type(String supported_ram_type) {
        this.supported_ram_type = supported_ram_type;
    }
}

