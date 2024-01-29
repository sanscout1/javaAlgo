package algoHRiver.Baekjoon.BruteForce.pwd1759;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1759
public class P1759 {
    public static char[] tmpArray = new char[20];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int c = sc.nextInt();
        char[] charArray = new char[c];
        for (int i = 0; i < c; i++) {
            charArray[i] = sc.next().charAt(0);
        }
        Arrays.sort(charArray);
        recur(1, l, c, charArray);
        System.out.println(sb);
    }

    public static void recur(int index, int l, int c, char[] charArray) {
        if (index == l + 1) {
            int countV = 0;  //모음
            int countC = 0;
            for (int i = 1; i < l + 1; i++) {
                if (tmpArray[i] == 'a' || tmpArray[i] == 'e' || tmpArray[i] == 'i' ||
                        tmpArray[i] == 'o' || tmpArray[i] == 'u') {
                    countV++;
                } else {
                    countC++;
                }
            }
            if (countV > 0 && countC > 1) {
                for (int i = 1; i < l + 1; i++) {
                    sb.append(tmpArray[i]);
                }
                sb.append('\n');
            }

            return;
        }

        for (int i = 0; i < c; i++) {

            if (charArray[i] > tmpArray[index - 1]) {
                tmpArray[index] = charArray[i];
                index++;
                recur(index, l, c, charArray);
                index--;
                tmpArray[index] = ' ';
            }

        }


    }


}
