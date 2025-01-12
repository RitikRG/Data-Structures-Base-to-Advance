package string;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        s=s.toLowerCase();
        t=t.toLowerCase();
        int[] arr_s=new int[26];
        int[] arr_t=new int[26];
        for(int i=0; i<s.length();i++){
            arr_s[(int)s.charAt(i)-97]++;
            arr_t[(int)t.charAt(i)-97]++;
        }
        if(Arrays.equals(arr_s, arr_t)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isAnagram(s,t));
    }
}
