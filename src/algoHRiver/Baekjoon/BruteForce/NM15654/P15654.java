package algoHRiver.Baekjoon.BruteForce.NM15654;
// https://www.acmicpc.net/problem/15654
import java.util.Arrays;
import java.util.Scanner;

public class P15654 {
    static int[] tmpArray = new int[10];
    static boolean[] tmpBoolArray = new boolean[10];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] inputArrays = new int[n];
        for (int i = 0; i < n; i++) {
            inputArrays[i] = in.nextInt();
            tmpBoolArray[i] = true;        }
        inputArrays=Arrays.stream(inputArrays).sorted().toArray();

        recur(1,n,m,inputArrays);
    }

    public static void recur (int index,int n,int m , int[] inputArrays){
        if(index==m+1){
            for (int i = 1; i < index; i++) {
                System.out.print(tmpArray[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            tmpArray[index] = inputArrays[i];
            if(tmpBoolArray[i]) {
                tmpBoolArray[i] = false;
                recur(++index, n, m, inputArrays);
                index--;
                tmpBoolArray[i] = true;
            }
            tmpArray[index]=0;

        }
    }
}
