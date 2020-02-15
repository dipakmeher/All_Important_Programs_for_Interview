import java.util.*;
import java.io.*;

public class ov{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        SortOddValues(a);
    }
    public static void SortOddValues(int a[]){
        int[] odd = new int[a.length];
        int j = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0){
                continue;
            }
            odd[j]=a[i];
            j++;
        }
        boolean v;
        int temp;
        for(int i=0;i<j-1;i++){
            v = false;
            for(int k = 0;k<j-i-1;k++){
                if(odd[k]>odd[k+1]){
                    temp = odd[k];
                    odd[k]=odd[k+1];
                    odd[k+1]=temp;
                    v=true;
                }
            }
            if(v = false){
                break;
            }
        }
        System.out.println("Array is, ");
        for(int i=0;i<j;i++){
            System.out.println(" "+odd[i]);
        }
    }
}