package algoHRiver.Baekjoon.BruteForce.NMK18290;

import java.util.Scanner;

public class P18290 {
    static int tmpans=0;
        static int ans = Integer.MIN_VALUE;
    static int kans =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] intnm = new int[n+4][m+4];
        boolean[][] boolnm = new boolean[n+4][m+4];
        for (int i = 2; i < n+2; i++) {
            for (int j = 2; j < m+2; j++) {
                intnm[i][j] = sc.nextInt();
            }
        }

        recur(intnm,boolnm,n,m,k);
        System.out.println(ans);

    }
    public static void recur(int[][] intnm ,boolean[][] boolnm,int n,int m,int k){
        if(kans == k) {
            if(ans < tmpans)
            {
                ans = tmpans;
            }
            return;
        }
        for (int i = 2; i < n+2; i++) {
            for (int j = 2; j < m+2; j++) {
                if (boolnm[i][j]){
                    continue;
                }
                if (!boolnm[i][j]&& !boolnm[i - 1][j] &&
                !boolnm[i + 1][j] &&
                !boolnm[i][j - 1] &&
                !boolnm[i][j + 1] ){
                    tmpans+=intnm[i][j];
                    kans++;
                    boolnm[i][j] = true;

                    recur(intnm,boolnm,n,m,k);
                    tmpans-=intnm[i][j];
                    kans--;
                    boolnm[i][j]=false;



                }

            }
        }

    }
}