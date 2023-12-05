package algoHRiver;
//https://www.acmicpc.net/problem/4375
//백준은 클래스 명이 Main 이어야 돌아감 ..
import java.util.*;
public class math01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int num =0;

            for (int i=1;; i++) {
                num = num*10 + 1;
                num %= n;
                if(num ==0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

}
