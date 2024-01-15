package algoHRiver.Baekjoon.BruteForce.NM15655;

import java.util.Arrays;
import java.util.Scanner;

public class P15655 {

    static int[] intCheck = new int[10];
    static boolean[] booleanCheck = new boolean[10];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = in.nextInt();
        }
        intArray = Arrays.stream(intArray).sorted().toArray();
        recur(1, n, m, intArray);

    }

    public static void recur(int index, int n, int m, int[] intArray) {
        if(index==m+1){
            for (int i = 1; i < m+1; i++) {
                System.out.print(intCheck[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            intCheck[index] = intArray[i];

            if (!booleanCheck[i]&&intCheck[index-1]<intCheck[index]) {
                booleanCheck[i] = true;
                recur(++index, n, m, intArray);
                booleanCheck[i] = false;
                index--;
            }
            intCheck[index] = 0;
        }

    }
}
