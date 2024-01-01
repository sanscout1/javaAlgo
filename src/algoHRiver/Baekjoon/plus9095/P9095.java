package algoHRiver.Baekjoon.plus9095;

import java.util.Scanner;

public class P9095 {
    static int count=0;
    public static int findCase (int tmpNum){
        //1 빼는 경우
        if(tmpNum>0){
            findCase(tmpNum-1);
        }
        //2 빼는 경우
        if(tmpNum>1){
            findCase(tmpNum-2);
        }
        //3 빼는 경우
        if(tmpNum>2){
            findCase(tmpNum-3);
        }
        if (tmpNum==0){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int tmpNum = in.nextInt();
            System.out.println(findCase(tmpNum));
            count=0;
        }
    }
}
