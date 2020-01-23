import java.util.*;
import java.io.*;

class Employee{
    private int id;
    private String name;
    private int salary;

    Employee(int id,String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Employee(){
        this.id = 0;
        this.name = "";
        this.salary = 0;
    }
    public void setId(int a){
        this.id = a;
    }
    public int getId(){
        return this.id;
    }
    public void setSalary(int s){
        this.salary = s;
    }
    public int getSalary(){
        return this.salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
public class EMA{
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"KRISHNA",100000000);
        Employee e2 = new Employee(2,"DIPAK",100000);
        Employee e3 = new Employee(1,"SURAJ",5000);
        Employee e4= getmaxsalaryemp(e1,e2,e3);
        System.out.println("Id: "+e4.getId()+" Name: "+e4.getName()+" Salary: "+e4.getSalary());
    }
    public static Employee getmaxsalaryemp(Employee e1, Employee e2, Employee e3){
        int a = e1.getSalary();
        int b = e2.getSalary();
        int c = e3.getSalary();
        
        if(a>b && a>c){
            return e1;
        }else if(b>a && b>c){
            return e2;
        }else if(c>a && c>b){
            return e3;
        }
        else{
            return null;   
        }
    }
}