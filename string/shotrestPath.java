package string;

import java.util.Arrays;
import java.util.Scanner;

public class shotrestPath {
    public static double shortestPath(String s){
        int[] coor = {0,0};
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='N'){
                coor[1]++;
            }else if(s.charAt(i)=='S'){
                coor[1]--;
            }else if(s.charAt(i)=='W'){
                coor[0]--;
            }else{
                coor[0]++;
            }
        }
        System.out.println(Arrays.toString(coor));
        return Math.sqrt(Math.pow(coor[0], 2)+Math.pow(coor[1], 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(shortestPath(s));
    }
}
