package algoHRiver.Baekjoon.BruteForce.NM15650;

import java.util.Scanner;

// https://www.acmicpc.net/problem/15650
public class P15650 {

    static int[] numArray = new int[11];
    static boolean[] boolArray = new boolean[11];

    public static void recur(int index,int n,int m){
        if(index==m+1){
            for (int i = 1; i <= m ; i++) {
                System.out.print(numArray[i]+" ");
            }
            System.out.println();
        }
        else{
            for (int i = 1; i <= n; i++) {
                if(boolArray[i]) {continue;}

                    numArray[index] = i;
                    boolArray[i] = true;
                if(numArray[index-1]<numArray[index]) {
                    recur(index+1, n, m);
                }
                    boolArray[i] = false;
                    numArray[index] = 0;

            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int m= in.nextInt();

        recur(1,n,m);
    }
}
