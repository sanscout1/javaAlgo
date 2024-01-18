package algoHRiver.Baekjoon.BruteForce.NM15656;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P15656 {
    static int[] checkIntArray = new int[10];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] tmpIntArray = new int[n];
        for (int i = 0; i < n; i++) {
            tmpIntArray[i] = in.nextInt();        }
        tmpIntArray=Arrays.stream(tmpIntArray).sorted().toArray();

        recur(0,n,m,tmpIntArray);
        System.out.println(sb);

    }
    public static void recur(int index ,int n , int m, int[] tmpIntArray){
        if(index==m){

            for (int i = 0; i < m; i++) {
               sb.append(checkIntArray[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i <n ; i++) {
            if(checkIntArray[index]==0) {
                checkIntArray[index] = tmpIntArray[i];
                recur(++index, n, m, tmpIntArray);
                index--;
                checkIntArray[index]=0;
            }
        }

    }
}
