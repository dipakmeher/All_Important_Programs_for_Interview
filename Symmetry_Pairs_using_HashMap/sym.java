import java.util.*;
import java.io.*;

class sym{
    static void findSymPairs(int arr[][]){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int first, sec,i ;
        for(i=0;i < arr.length;i++){
            first = arr[i][0];
            sec = arr[i][1];

            Integer val = hm.get(sec);
            System.out.println("Val = "+val);
            if(val != null && val == first){
                System.out.println("Hare Krishana");
            }else{
                hm.put(first,sec);
            }
        }
        System.out.println("Initial Mappings are: " + hm); 
    }
    public static void main(String[] args){
        int arr[][] = new int[5][2]; 
        arr[0][0] = 11; arr[0][1] = 20; 
        arr[1][0] = 30; arr[1][1] = 40; 
        arr[2][0] = 5;  arr[2][1] = 10; 
        arr[3][0] = 40;  arr[3][1] = 30; 
        arr[4][0] = 10;  arr[4][1] = 5; 
        findSymPairs(arr);    
     }
}