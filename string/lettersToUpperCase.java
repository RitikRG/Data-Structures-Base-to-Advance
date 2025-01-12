package string;

import java.util.Scanner;

public class lettersToUpperCase {
    public static String convertCase(String s){
        StringBuilder sb=new StringBuilder("");
        String upper=s.toUpperCase();
        boolean isFirst=true;
        for(int i=0;i<s.length();i++){
            if(isFirst){
                sb.append(upper.charAt(i));
                isFirst=false;
            }else if(s.charAt(i)==' '){
                isFirst=true;
                sb.append(' ');
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(convertCase(s));
    }
}
