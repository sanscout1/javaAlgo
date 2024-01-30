package algoHRiver.Baekjoon.BruteForce.P14889;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class P14889 {
    static int[][] tmpArray;


    static int n;
    static int ans = Integer.MAX_VALUE;
    static boolean[] tmpbool;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tmpArray = new int[n][n];
        tmpbool = new boolean[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                tmpArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        func(0,0);
        System.out.println(ans);
    }

    public static void func(int index,int count) {

        if (count == n / 2) {
            func1();
            return;
        }
        for (int i = index; i < n; i++) {
            if (!tmpbool[i]) {
                tmpbool[i] = true;
                func(i + 1,count+1);
                tmpbool[i] = false;
            }
        }
    }
    public static void func1(){
        int link = 0;
        int start = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!tmpbool[j] && !tmpbool[i]) {
                    link = link + tmpArray[i][j] + tmpArray[j][i];
                }
                if (tmpbool[j] && tmpbool[i]) {
                    start = start + tmpArray[i][j] + tmpArray[j][i];
                }
            }
        }
        int diff= Math.abs(start-link);
        if (diff == 0) {
            System.out.println(diff);
            System.exit(0);
        }
        ans=Math.min(ans,diff);
    }
}


