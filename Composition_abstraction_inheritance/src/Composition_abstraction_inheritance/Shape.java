

package Composition_abstraction_inheritance;
public abstract class Shape {
   
    private String name;
    private int edgenumber;
    private double length;
    
    public Shape(int edgenumber, double length, String name) {
        this.edgenumber = edgenumber;
        this.length = length;
        this.name = name;
    }

    public int getEdgenumber() {
        return edgenumber;
    }
    public void setEdgenumber(int edgenumber) {
        this.edgenumber = edgenumber;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    abstract double calculateArea(String name, int edgenumber, double length);
    
}


