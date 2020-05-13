package Composition_abstraction_inheritance;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;


public class Programs {
    
    String programs ;
    
    public String getPrograms() {    
        programs ="Google Chrome "+" Calculator";
        return programs;    
    }
    
    public void browser(){
          URI uri = URI.create("http://www.google.com.tr");
        try {
            System.out.println("You can use browser now.");
            Desktop.getDesktop().browse(uri);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    public void calculator(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name of shape :");
        String name=scanner.next();
        System.out.print("Ente number of edge : ");
        int edgenumber=scanner.nextInt();
        System.out.print("Enter length of edge :");
        double length = scanner.nextDouble();
        RegularPolygon regularPolygon = new RegularPolygon(edgenumber, length, name);
        
        System.out.println("Area of "+ name+ " = "+regularPolygon.calculateArea(name, edgenumber, length)+"\n");
    }
}


