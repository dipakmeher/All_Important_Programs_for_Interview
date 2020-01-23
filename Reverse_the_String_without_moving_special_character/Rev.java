import java.util.*;
import java.lang.*;
import java.io.*;

class Rev {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] stat = new String[n];
        String[] stat1 = new String[n];
        for(int i=0;i<n;i++){
            stat[i]=sc.next();
        }
        char temp;String s;
        char[] str;
        for(int i=0;i<n;i++){
            s = stat[i];
            str = s.toCharArray();
            int r = str.length-1,l=0;

            while(l<r){
                if(!Character.isAlphabetic(str[l])){
                    l++;

                }else if(!Character.isAlphabetic(str[r])){
                    r--;
                }
                else{
                    temp = str[l];
                    str[l]=str[r];
                    str[r]=temp;
                    l++;
                    r--;
                }
            }
            String reverse = String.valueOf(str);
            stat1[i] = reverse;
        }

        for(int i=0;i<n;i++){
            System.out.println(""+ stat1[i]);
        }
        
	}
}