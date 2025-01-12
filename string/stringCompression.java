package string;

import java.util.ArrayList;
import java.util.Scanner;

public class stringCompression {
    public static String compressString(String s){
        StringBuilder sb = new StringBuilder("");
        boolean isFirst=true;
        for(int i=0; i<s.length();){
            char c=s.charAt(i);
            int count=1;
            int j=i+1;
            while (j<s.length() && s.charAt(j)==c) {
                count++;
                j++;
            }
            sb.append(c);
            sb.append(count);
            i=i+count;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(compressString(s));

    }
}
