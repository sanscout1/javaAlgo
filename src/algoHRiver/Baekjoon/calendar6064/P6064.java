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
            int ansXNum = in.nextInt()-1;
            int ansYNum = in.nextInt()-1;
            //맞는거 같은데 뭐가문제지
            boolean flag = false;
            // 3 3 ,3 1, 3 11   //// 3%12 3  13%12 1   23%12 2
            for (int j = ansXNum; j < endXNum * endYNum; j += endXNum) {
                if (j % endYNum == ansYNum) {   // 6 6  6 6  일 때를 생각 해보면 j가 6일때는 0  == 6 이라 답이어야 하는데 답이 아닌 경우 가 나옴
                    //나머지 연산을 활용할떄는 수를 1씩 빼고 연산 후 다시 더하는 연습을 하자
                        System.out.println(j+1);
                        flag = true;
                        break;
                }
            }
            if (!flag)
                System.out.println(-1);
        }
    }
}





