package Composition_abstraction_inheritance;

public class Monitor {

    private String model;
    private String type;
    private String size;
    private Resolution resolution;

    public Monitor(String model, String type, String size, Resolution resolution) {
        this.model = model;
        this.type = type;
        this.size = size;
        this.resolution = resolution;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public Resolution getResolution() {
        return resolution;
    }
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}


