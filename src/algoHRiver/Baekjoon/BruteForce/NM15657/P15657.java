package algoHRiver.Baekjoon.BruteForce.NM15657;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/15657
public class P15657 {
    static int[] ansArray = new int[10];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = in.nextInt();        }
        intArray=Arrays.stream(intArray).sorted().toArray();

        recur(1,intArray,n,m);
        System.out.println(sb);
    }

    public static void recur(int index, int[] intArray, int n , int m){
        if(index==m+1){
            for (int i = 1; i < m+1; i++) {
                sb.append(ansArray[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        else{

            for (int i = 0; i < n; i++) {
                ansArray[index]=intArray[i];
                if(ansArray[index]>=ansArray[index-1]) {

                    recur(++index, intArray, n, m);
                    index--;
                }
            }

        }
    }
}
