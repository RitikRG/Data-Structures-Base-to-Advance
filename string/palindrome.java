package string;

import java.util.Scanner;

import patterns_practise.star;

public class palindrome {
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        int end=s.length()-1;
        int start=0;
        while(start<=end){
            char c = s.charAt(start);
            char d = s.charAt(end);
            if(!(((int)c >=97 && (int)c <= 122)||((int)c>=48 && (int)c<=57))){
                start++;
            }else if(!(((int)d >=97 && (int)d <= 122)||((int)d>=48 && (int)d<=57))){
                end--;
            }else{
                if(s.charAt(start)!=s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}