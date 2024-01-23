//https://www.acmicpc.net/problem/1037

package algoHRiver.Baekjoon.beforebaek;

import java.util.Scanner;
public class math02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for (int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int small, big;
        small = big =a[0];
        for (int i=0;i<n;i++){
            if(small>a[i]){
                small = a[i];
            }
            if(big<a[i]){
                big = a[i];
            }
        }

        int ans = big* small;
        System.out.println(ans);
    }
}
