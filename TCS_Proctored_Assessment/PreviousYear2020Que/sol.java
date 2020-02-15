//5 objects, string match and also rps should be less than 3, sid should be printed w.r.t to balance in descending order
import java.util.*;
import java.io.*;

class Sim{
    int sid;
    String name;
    double bal;
    double rps;//ratepersecond
    String c;//c -  Circle
}
public class sol{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim s1 = new Sim();
        Sim s2 = new Sim();
        Sim s[]= {s1,s2};

        for(int i=0;i<s.length;i++){
            s[i].sid = sc.nextInt();
            s[i].name = sc.next();
            s[i].bal = sc.nextDouble();
            s[i].rps = sc.nextDouble();
            s[i].c = sc.next();
        }

        String key  = sc.next();
        int val = sc.nextInt();

        for(int i=0;i<s.length;i++){
            if(s[i].c.equals(key) && s[i].rps<3){
                // System.out.println(s[i].sid);
            }   
            else{
                s[i].sid=0;
            }
        }
        int count = 0;
        for(int i=0;i<s.length;i++){
            if(s[i].sid>0){
                count++;
            }
        }
        double[] d = new double[count];
        int k=0;
        for(int i=0;i<s.length;i++){
            if(s[i].sid>0){
                d[k] = s[i].bal;
                k++;
            }
        }
        double temp;
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d.length-1;j++){
                if(d[j]<d[j+1]) {
                    temp = d[j+1];
                    d[j+1]=d[j];
                    d[j]=temp;
                }       
            }
        }
        for(int i=0;i<d.length;i++){
            for(int j = 0;j<s.length;j++){
                if(s[i].sid>0){
                    if(d[i] == s[i].bal){
                        System.out.println(" "+s[i].sid);   
                    }
                }
            }
        }
    }
}