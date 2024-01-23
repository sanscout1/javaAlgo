package algoHRiver.Baekjoon.beforebaek;

import java.util.*;
public class math07 {

    static boolean prime(int x) {
             if(x<2) {
                 return false;
             }
             for (int i =2;i*i<=x;i++){
                 if(x%i==0){
                     return false;
                 }
             }
             return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total =0;
        for (int i =0; i<n;i++) {
            int x=sc.nextInt();
            if(prime(x)){
                total++;
            }
        }

        System.out.println(total);

    }
}
