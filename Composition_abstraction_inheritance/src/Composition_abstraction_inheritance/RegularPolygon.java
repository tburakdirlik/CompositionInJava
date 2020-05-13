package Composition_abstraction_inheritance;


public class RegularPolygon extends Shape {

    public RegularPolygon(int edgenumber, double length, String name) {
        super(edgenumber, length, name);
    }

    @Override
    double calculateArea(String name, int edgenumber, double length) {
    double angle= Math.toRadians(180/edgenumber);
    angle=Math.tan(angle);
    double area=((length*length*edgenumber)/(4*angle));
        return area;
        
    }
}

