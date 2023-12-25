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

    // 1차 풀이, 접근은 좋았으나 뭔가 틀렸다.
//        int[] realYear = new int[T];
//
//        for (int i = 0; i < T; i++) {
//
//            int endXNum = in.nextInt();
//            int endYNum = in.nextInt();
//            int ansXNum = in.nextInt();
//            int ansYNum = in.nextInt();
//
//
//
//            // 3 3 ,3 1, 3 11  x가 y 보다 작은 만큼 x값이 정답에 돌아올때마다 y값은 감소
//
//            // 5 5 , 5 7  ,5 9   x가 y보다 큰만큼 y 는 x값이 정답에 돌아올때마다 증가
//
//
//            //답에 접근 가능한지 확인
//            int diffXY = endXNum-endYNum;
//            ArrayList<Integer> tmpCheck = new ArrayList<>();
//            int tmpCheckNumber = ansXNum;
//            realYear[i] =ansXNum;
//            if(endYNum>ansXNum) {
//                tmpCheck.add(ansXNum);
//
//            }
//            else {
//                realYear[i]=-1;
//            }
//            //
//
//
//            while(realYear[i]>0){
//                if(tmpCheckNumber==ansYNum){
//                    break;
//                }
//
//                tmpCheckNumber+=diffXY;
//                realYear[i] +=endXNum;
//                if(tmpCheckNumber<0){
//                    tmpCheckNumber+=endYNum;
//                } else if (tmpCheckNumber>endYNum) {
//                    tmpCheckNumber-=endYNum;
//                }
//                if(tmpCheck.contains(tmpCheckNumber)){
//                    realYear[i]= -1;
//                    break;
//                }
//                tmpCheck.add(tmpCheckNumber);
//            }
//            //
//
//        }
//        for (int i = 0; i < T; i++) {
//            System.out.println(realYear[i]);
//        }



