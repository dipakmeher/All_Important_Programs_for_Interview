import java.util.*;
import java.io.*;

class Employee{
    private int id;
    private String name;
    private double range;
    private double t;

    Employee(int id,String name, double range, double t){
        this.id = id;
        this.name = name;
        this.range=range;
        this.t = t;
    }
    Employee(){
        this.id = 0;
        this.name = "";
        this.range=0;
        this.t =0;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setRange(double range){
        this.range =  range;
    }
    public double getRange(){
        return this.range;
    }
    public void setT(double t){
        this.t = t;
    }
    public double getT(){
        return this.t;
    }

}

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee(1,"dipak",85,50);
        Employee e2 = new Employee(2,"Rupesh p",65,50);
        Employee e3 = new Employee(3,"Shivraj p",75,50);
        Employee[] e = {e1,e2,e3};

        // for(int i=0;i<e.length;i++){
        //     int id = sc.nextInt();
        //     e[i].setId(id);
        //     String name = sc.next();
        //     e[i].setName(name);
        //     double range = sc.nextDouble();
        //     e[i].setRange(range);
        //     double t = sc.nextDouble();
        //     e[i].setT(t);
        // }
       // int limit = sc.nextInt();
       int limit = 45;
        replish(e,limit);
    }
    public static void replish(Employee e[],int limit){
        Employee[] s = new Employee[e.length];
        int j=0;
        // for(int i=0;i<e.length;i++){
        //    System.out.println("Id"+ i +" = "+e[i].getId());
        //    System.out.println("Name "+ i +" = "+e[i].getName());
        //    System.out.println("Range "+ i +" = "+e[i].getRange());
        //    System.out.println("T"+ i +" = "+e[i].getT());
      
        // }
        for(int i=0;i<e.length;i++){
            // if(e[i].getT() > limit){
            //     s[j].setId(e[i].getId());
            //     s[j].setName(e[i].getName());
            //     s[j].setRange(e[i].getRange());
            //     s[j].setT(e[i].getT());
            //     j++;
            // }
            if(e[i].getT() > limit){
                j++;
            }
            else{
                System.out.println(e[i].getId());
                e[i].setId(0);
            }
        }
        for(int i=0;i<s.length;i++){
            if(e[i].getId()>0){
                if(e[i].getT()<65){
                    System.out.println("gone");
                }else if(e[i].getT() >65 || e[i].getT()<95){
                    System.out.println("Present");
                }
            }
         }
    }
}