import java.util.*;
import java.io.*;

class coprime{

    static int gcd(int a, int b){
        if(a==0 || b==0){
            return 0;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return gcd(a-b,b);
        }

        return gcd(a,b-a);
    }
    static boolean Coprime(int a, int b){
        return (gcd(a,b)==1);
    }
    static int NoOfPairs(int arr[], int n){
        int i,j,count=0;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(Coprime(arr[i],arr[j])){
                    count++;
                    System.out.print("("+arr[i]+" , "+arr[j]+")");
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr={ 1, 2, 5, 4, 8, 3, 9 };
        int n = arr.length;
        System.out.println("Coprime Factor are: "+ NoOfPairs(arr, n));
    }
}