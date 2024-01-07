package algoHRiver.Baekjoon.BruteForce.NM15649;

import java.util.Scanner;

//https://www.acmicpc.net/problem/15649
public class P15649 {
    static boolean[] tmpBool = new boolean[11];
    static int[] tmpNum  = new int[11];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int m = in.nextInt();
        int index=0;
        recur(index,n,m);

    }

    public static void recur(int index,int n ,int m){
        if(index==m){

            for (int i = 0; i < index; i++) {
                System.out.print(tmpNum[i]+" "); // 1,2,3,4  index==4
            }
            System.out.println();
        }
        else if(index<m){
            for (int i = 1; i <= n; i++) {
                if(tmpBool[i]) continue;  // 어 1 이 true네? 하고 넘어가 저장안하고
                tmpBool[i]=true; // true 면  1
                tmpNum[index]=i;  // 1,2,3,4  index==4 1, 1
                index++;
                recur(index,n,m);   // 여기서 저장 못하게 할려고 --> 중복이 안되게
                index--;
                tmpBool[i]=false;
            }

        }
    }

}
