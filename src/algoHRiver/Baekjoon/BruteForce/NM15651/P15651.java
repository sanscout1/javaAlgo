package algoHRiver.Baekjoon.BruteForce.NM15651;

import java.util.Arrays;
import java.util.Scanner;

public class P15651 {

    static StringBuilder tmpArray = new StringBuilder();
    static int[] tmpArrayInt = new int[11];

    public static void recur(int index, int m, int n) {
        if (index == n) {

            for (int i = 0; i < n; i++) {
                tmpArray.append(tmpArrayInt[i]).append(" ");
            }
            tmpArray.append("\n");

        } else {
            for (int i = 1; i <= m; i++) {

                tmpArrayInt[index]=i;
                index++;
                recur(index, m, n);
                index--;

            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int index = 0;
        recur(index, m, n);
        System.out.println(tmpArray);

    }
}