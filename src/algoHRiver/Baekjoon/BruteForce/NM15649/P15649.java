package algoHRiver.Baekjoon.BruteForce.NM15649;

import java.util.Scanner;

//https://www.acmicpc.net/problem/15649
public class P15649 {
    static boolean[] tmpBool = new boolean[11];
    static int[] tmpNum  = new int[11];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int m = in.nextInt();
        int index=0;
        recur(index,n,m);

    }

    public static void recur(int index,int n ,int m){
        if(index==m){

            for (int i = 0; i < index; i++) {
                System.out.print(tmpNum[i]+" ");
            }
            System.out.println();
        }
        else if(index<m){
            for (int i = 1; i <= n; i++) {
                if(tmpBool[i]) continue;
                tmpBool[i]=true;
                tmpNum[index]=i;
                index++;
                recur(index,n,m);
                index--;
                tmpBool[i]=false;
            }

        }
    }

}
