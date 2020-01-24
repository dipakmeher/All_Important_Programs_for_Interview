import java.util.*;
import java.io.*;

class Employee{
    private String city;
    private int age;
    private String name;

    Employee(){
        this.city="";
        this.age=0;
        this.name="";
    }
    Employee(String name, String city, int age){
        this.city = city;
        this.age = age;
        this.name = name;
    }
    public void setCity(String c){
        this.city = c;
    }
    public String getCity(){
        return this.city;
    }
    public void setAge(int a){
        this.age = a;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }

}
public class ca{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        // Employee e = new Employee();
        // e.setAge(sc.nextInt());
        // e.setCity(sc.nextLine());
        // e.setName(sc.nextLine());

        Employee e1 = new Employee("Krishna","Goloka Vrindavan",15);
        Employee e2 = new Employee("Dipak","Goloka",22);
        Employee e3 = new Employee("Prafull","Goloka",22);
        int e4 = getempwithsameNameCity(e1,e2,e3);
        System.out.println("Same City and Name: "+ e4);
    }
    public static int getempwithsameNameCity(Employee e1, Employee e2, Employee e3){
        int a = e1.getAge();
        int b = e2.getAge();
        int c = e3.getAge();

        String x = e1.getCity();
        String y = e2.getCity();
        String z = e3.getCity();

        if(a==b && x.equals(y)){
            if(b==c && y.equals(z)){
                return 3;
            }
            return 2;
        }else if(b==c && y.equals(z)){
            return 2;
        }else{
            return 0;
        }
    }
}