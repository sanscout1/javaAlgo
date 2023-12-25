package algoHRiver.Baekjoon.calendar6064;

import java.util.Scanner;

//https://www.acmicpc.net/problem/6064
public class P6064 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {

            int endXNum = in.nextInt();
            int endYNum = in.nextInt();
            int ansXNum = in.nextInt();
            int ansYNum = in.nextInt();
            //맞는거 같은데 뭐가문제지
            boolean flag = false;
            // 3 3 ,3 1, 3 11   //// 3%12 3  13%12 1   23%12 2
            for (int j = ansXNum; j <= endXNum * endYNum; j += endXNum) {
                if (j % endYNum == ansYNum) {
                    System.out.println(j);
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(-1);
        }
    }
}





