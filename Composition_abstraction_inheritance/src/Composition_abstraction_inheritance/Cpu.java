package Composition_abstraction_inheritance;
public class Cpu {
    
    private String cpu_model;
    private double cache_capacity;
    private double base_frequency;
    private double max_frequency;
    private int core_number;

    public Cpu(String cpu_model, double cache_capacity, double base_frequency, double max_frequency, int core_number) {
        this.cpu_model = cpu_model;
        this.cache_capacity = cache_capacity;
        this.base_frequency = base_frequency;
        this.max_frequency = max_frequency;
        this.core_number = core_number;
    }
    public String getCpu_model() {
        return cpu_model;
    }
    public void setCpu_model(String cpu_model) {
        this.cpu_model = cpu_model;
    }
    public double getCache_capacity() {
        return cache_capacity;
    }
    public void setCache_capacity(double cache_capacity) {
        this.cache_capacity = cache_capacity;
    }
    public double getBase_frequency() {
        return base_frequency;
    }
    public void setBase_frequency(double base_frequency) {
        this.base_frequency = base_frequency;
    }
    public double getMax_frequency() {
        return max_frequency;
    }
    public void setMax_frequency(double max_frequency) {
        this.max_frequency = max_frequency;
    }
    public int getCore_number() {
        return core_number;
    }
    public void setCore_number(int core_number) {
        this.core_number = core_number;
    }
}


