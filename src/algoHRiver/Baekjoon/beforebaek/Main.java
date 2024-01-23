//https://jungol.co.kr/problem/1291?cursor=eyJwcm9ibGVtc2V0Ijo2LCJmaWVsZCI6MCwiaWR4IjowfQ%3D%3D

package algoHRiver.Baekjoon.beforebaek;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean flag = true;
        int s = sc.nextInt();
        int e = sc.nextInt();
        while(flag) {

            if (s < 2 || s > 9 || e < 2 || e > 9) {
                System.out.println("INPUT ERROR!");
                s = sc.nextInt();
                e = sc.nextInt();
            }
            else{
                flag=false;
            }
        }
        if (s>=e){

            for(int j=1;j<10; j++){

                for(int i=s; i>=e; i--){
                    if(i*j<10){
                        System.out.print(i+" * "+j+" =  "+(i*j)+"   ");

                    }
                    else {
                        System.out.print(i + " * " + j + " = " + (i * j) + "   ");
                    }
                }
                System.out.print("\n");
            }
        }

        else {
            for(int j=1;j<10; j++){
                for(int i=s; e>=i; i++) {
                    if (i * j < 10) {
                        System.out.print(i + " * " + j + " =  " + (i * j) + "   ");

                    } else {
                        System.out.print(i + " * " + j + " = " + (i * j) + "   ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}