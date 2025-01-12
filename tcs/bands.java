package tcs;
import java.util.*;
import java.util.Scanner;

public class bands {
    public static int calcOverlap(int x,int y,int bandNum,String path, int[][] matrix, int N){
        int overlap=0;
        for(int i=0;i<path.length();i++){
            char c = path.charAt(i);
            if(c=='r'){
                y++;
            }else if(c=='l'){
                y--;
            }else if(c=='u'){
                x--;
            }else if(c=='d'){
                x++;
            }
            if (x < 0 || x >= N || y < 0 || y >= N) {
                continue;
            }
            if(matrix[x][y]!=bandNum){
                overlap++;
            };
        }
        return overlap;
    }
    public static boolean isTop(int x,int y,int bandNum,String path, int[][] matrix, int N){
        for(int i=0;i<path.length();i++){
            char c = path.charAt(i);
            if(c=='r'){
                y++;
            }else if(c=='l'){
                y--;
            }else if(c=='u'){
                x--;
            }else if(c=='d'){
                x++;
            }
            if (x < 0 || x >= N || y < 0 || y >= N) {
                continue;
            }
            if(matrix[x][y]!=bandNum){
                return false;
            };
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix= new int[N][N];
        
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x1Copy=x1;
        int y1Copy=y1;
        String path1 = sc.next();

        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x2Copy=x2;
        int y2Copy=y2;
        String path2 = sc.next();

        int maxLength = Math.max(path1.length(), path2.length());
        for(int i=0;i<maxLength;i++){
            if(i<path1.length()){
                char c = path1.charAt(i);
                if(c=='r'){
                    y1++;
                }else if(c=='l'){
                    y1--;
                }else if(c=='u'){
                    x1--;
                }else if(c=='d'){
                    x1++;
                }
                matrix[x1][y1]=1;
            }
            if(i<path2.length()){
                char c = path2.charAt(i);
                if(c=='r'){
                    y2++;
                }else if(c=='l'){
                    y2--;
                }else if(c=='u'){
                    x2--;
                }else if(c=='d'){
                    x2++;
                }
                matrix[x2][y2]=2;
            }
        }
        // for(int i=0; i<N; i++){
        //     System.out.println(Arrays.toString(matrix[i]));
        // }
        boolean isTop1=isTop(x1Copy, y1Copy, 1, path1, matrix, N);
        boolean isTop2=isTop(x2Copy, y2Copy, 2, path2, matrix, N);
        if(isTop1|| isTop2){
            if(isTop1){
                System.out.print(calcOverlap(x2Copy, y2Copy, 2, path2, matrix, N));
            }else{
                System.out.print(calcOverlap(x1Copy, y1Copy, 1, path1, matrix, N));
            }

        }else{
            System.out.print("Impossible");
        }
    }
}
