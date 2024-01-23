package algoHRiver.Baekjoon.BruteForce.NMK18290;

import java.util.Scanner;

public class P18290 {
    static int tmpans=0;
    static int ans =0;
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

        for (int i = 2; i < n+2; i++) {
            for (int j = 2; j < m+2; j++) {
                if(kans == k) {
                    if(ans < tmpans)
                    {
                        ans = tmpans;
                    }
                    return;
                }
                if (!boolnm[i][j]){
                    tmpans+=intnm[i][j];
                    kans++;
                    boolnm[i][j] = true;
                    boolnm[i - 1][j] = true;
                    boolnm[i + 1][j] = true;
                    boolnm[i][j - 1] = true;
                    boolnm[i][j + 1] = true;
                    recur(intnm,boolnm,n,m,k);
                    tmpans-=intnm[i][j];
                    kans--;
                    boolnm[i][j]=false;
                    boolnm[i - 1][j] = false;
                    boolnm[i + 1][j] = false;
                    boolnm[i][j - 1] = false;
                    boolnm[i][j + 1] = false;
                    for (int l = -1; l < 2; l++) {
                        for (int o = -1; o < 2; o++) {
                            if(boolnm[i + l][j + o]){
                                boolnm[i + l -1][j + o] = true;
                                boolnm[i + l +1][j + o] = true;
                                boolnm[i + l ][j + o -1] = true;
                                boolnm[i + l ][j + o +1] = true;
                            }
                        }
                    }
                }

            }
        }

    }
}