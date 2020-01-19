import java.util.*;
import java.io.*;

class anagram{
    static boolean CheckAnagram(String str){
        int odd = 0;
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] % 2 == 0) {
            }else{
                odd++;
            }
        }
        if(odd>1){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
             str = "cdcdcdcdeeeef";
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error Message");
            return;
        }
        boolean result = CheckAnagram(str);
        if(result){
            System.out.println("String is pallindrome.");
        }else{
            System.out.println("String is not Pallidrome.");
        }
    }
}