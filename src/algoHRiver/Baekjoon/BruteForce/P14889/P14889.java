package algoHRiver.Baekjoon.BruteForce.P14889;

import java.util.Scanner;

import static java.lang.Math.abs;

public class P14889 {
    static int[][] tmpArray;
    static int link =0;

    static int n;
    static int ans=10000000;



    static boolean[] tmpbool;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        tmpArray= new int[n+1][n+1];
        tmpbool=new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                tmpArray[i][j]= sc.nextInt();
            }
        }
        func(0,0);
        System.out.println(ans);
    }
    public static void func(int index,int start){

        if(index == n/2){
            if(ans>abs(link-start)){
                ans=abs(link-start);
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i==j){continue;}
                if(!tmpbool[j] && !tmpbool[i])
                 {
                    tmpbool[i] = true;
                    tmpbool[j] = true;
                    link = link  + tmpArray[i][j]+ tmpArray[j][i];
                    func(index+2,start + tmpArray[i][j]+ tmpArray[j][i]);
                     link = link  - tmpArray[i][j] - tmpArray[j][i];
                    tmpbool[i] = false;
                    tmpbool[j] = false;
                }
            }
        }
    }
}
