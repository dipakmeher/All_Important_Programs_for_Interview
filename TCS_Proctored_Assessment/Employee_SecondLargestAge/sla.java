import java.util.*;
import java.io.*;

class Employee{
    private int id;
    private String name;
    private int age;

    Employee(){
        this.id = 0;
        this.name = "";
        this.age = 0;
    }
    Employee(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
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
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
public class sla{
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"aaa",22);
        Employee e2 = new Employee(2,"bbb",33);
        Employee e3 = new Employee(3,"ccc",55);
        Employee e4 = new Employee(4,"ddd",44);
        Employee e[]={e1,e2,e3,e4};
        getsecondlowestage(e);
    }
    public static void getsecondlowestage(Employee e[]){
        Employee t=null,s=null;
        Employee d=null;
        int c,a=100,b=100;//a is lowest number, b is second lowest number
        for(int i=0;i<e.length;i++){
            c = e[i].getAge();
            if(c<b){
                if(c<a){
                    b=a;
                    a=c;
                    t=s;
                    s=e[i];
                }else{
                    t=e[i];
                    b=c;
                }
            }
        }
        System.out.println("Following is the data: ");
        for(int i=0;i<e.length;i++){
            d = e[i];
            System.out.println("ID: "+d.getId()+", Name: "+d.getName()+", Age: "+d.getAge());
        }
        System.out.println("");
        System.out.println("Second Lowest element is: ");
        System.out.println("ID: "+t.getId()+", Name: "+t.getName()+", Age"+t.getAge());
    }
}