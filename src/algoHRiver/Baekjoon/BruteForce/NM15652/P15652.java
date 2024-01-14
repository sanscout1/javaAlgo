package algoHRiver.Baekjoon.BruteForce.NM15652;

import java.util.Scanner;
// https://www.acmicpc.net/problem/15652
public class P15652 {
    static int[] tmpArray = new int[10];
    static boolean[] tmpBoolArray = new boolean[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        recur(1, n, m);

    }

    public static void recur(int index, int n, int m) {
        if (index == m+1) {
            for (int i = 1; i < m+1; i++) {
                System.out.print(tmpArray[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            tmpArray[index] = i;
            if (tmpArray[index]>= tmpArray[index-1]) {

                recur(++index, n, m);
                index--;

            }
        }
    }
}
