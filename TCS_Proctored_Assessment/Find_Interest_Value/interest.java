import java.util.*;
import java.io.*;

class Account{
    private int id;
    private double balance;
    private double interestRate;
    Account(int id, double bal, double ir){
        this.id = id;
        balance = bal;
        interestRate = ir;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setBal(double bal){
        this.balance = bal;
    }
    public double getBal(){
        return this.balance;
    }
    public void setIr(double ir){
        this.interestRate = ir;
    }
    public double getIr(){
        return this.interestRate;
    }
    public void calculateInterest(double ir, double yr){
        double calc,sum;
        calc = (ir*yr)/100;
        sum = ir + calc;
        System.out.format("Final Interest = %.3f", sum);
    }
}
public class interest{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        double bal = sc.nextDouble();
        double ir = sc.nextDouble();
        int noOfYears =  sc.nextInt();
        Account a = new Account(id,bal,ir);
        a.setId(id);
        a.setBal(bal);
        a.setIr(ir);
        a.calculateInterest(a.getIr(),noOfYears);
    }
}