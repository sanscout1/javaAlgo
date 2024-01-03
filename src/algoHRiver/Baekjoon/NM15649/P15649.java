package algoHRiver.Baekjoon.NM15649;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/15649
public class P15649 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int m = in.nextInt();
        int print = m;
        int[] tmpArray = new int[m];
        int index=0;
        recur(tmpArray,index,n,m,print);
    }


    public static void recur(int[] tmpArray,int index,int n,int m,int print){
        boolean flag=false;
        if(m>0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <=index ; j++) {
                    if(tmpArray[j]==i){
                        flag=true;
                    }
                }
                if(!flag) {
                    m--;
                    tmpArray[index] = i;
                    index++;
                    recur(tmpArray, index, n, m, print);
                    index--;
                    m++;
                }
                flag=false;
            }
        }
        if(m==0){
            for (int i = 0; i < print; i++) {
                System.out.print(tmpArray[i]+" ");
            }
            System.out.println();
        }
    }



}
