import java.util.*;
import java.io.*;

class circle{
    private double radius;
    private double pi = 3.14;

    public void setRadius(double r){
        this.radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double Area(){
        return pi*radius*radius;
    }
    public double Circumference(){
        return 2* pi *radius;
    }
}
public class sg{
    public static void main(String[] args) {
        circle c = new circle();
        Scanner sc = new Scanner(System.in);
        c.setRadius(sc.nextDouble());
        System.out.println("Radius = "+ c.getRadius());
        System.out.println("The area of circle is "+c.Area());
        System.out.println("The Circumference of circle is "+ c.Circumference());
    }
}