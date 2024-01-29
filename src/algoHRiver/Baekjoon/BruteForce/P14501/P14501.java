package algoHRiver.Baekjoon.BruteForce.P14501;

import java.util.Scanner;


public class P14501 {
    static int n;
    static int ans = 0;
    static int[] useDays;
    static int[] getPay;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        useDays = new int[n + 1];
        getPay = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            useDays[i] = scanner.nextInt();
            getPay[i] = scanner.nextInt();
        }
        func(1, 0);
        System.out.println(ans);


    }

    public static void func(int day, int sum) {

        if (day == n + 1) {
            if (sum > ans) {
                ans = sum;
            }
            return;
        }
        if (day > n + 1) {
            return;
        }
        func(day+1, sum);
        func(day + useDays[day], sum + getPay[day]);


    }
}
