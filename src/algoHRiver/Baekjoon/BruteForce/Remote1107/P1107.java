package algoHRiver.Baekjoon.BruteForce.Remote1107;

// https://www.acmicpc.net/problem/1107

import java.util.Scanner;

public class P1107 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int endChannel = in.nextInt();
        int anslength = 0;
        boolean flag = true;
        boolean[] brokenButtons = new boolean[10];

        int brokenButtonTotal = in.nextInt();    //고장난 버튼 등록
        for (int i = 0; i < brokenButtonTotal; i++) {
            brokenButtons[in.nextInt()] = true;
        }

        int buttonClick = Math.abs(endChannel - 100);

        for (int i = 0; i < 1000001; i++) {

            int tmpNum = i;
            flag = true;
            anslength = 0;
            if (tmpNum == 0) {
                if (!brokenButtons[0]) {
                    anslength = 1;
                }
            }
            // anslength = 0;   //1222 11:06 --> 여기서 초기화 하는 거 때문에 오류발생, 초기화 지점을 잘 생각하자
            while (tmpNum > 0) {
                if (brokenButtons[tmpNum % 10]) {
                    flag = false;
                    break;
                }
                anslength++;
                tmpNum /= 10;
            }
            if (flag) {
                if (anslength > 0) {
                    tmpNum = Math.abs(i - endChannel);
                    if (tmpNum >= 0) {                      // 1222 10:56   endchannel : 1, 고장난 버튼 0 뺴고 모두일 때, 100에서 접근해서 99가 나오는중
                        if (buttonClick > anslength + tmpNum) {
                            buttonClick = anslength + tmpNum;
                        }
                    }
                }
            }
        }
        System.out.println(buttonClick);


//        int buttonClick = 1000000;
//        String minOfBtn ="";
//        String endChannel = in.nextLine();
//        int brokenButtonTotal = in.nextInt();
//        StringBuilder brokenButton = new StringBuilder();
//        //long startTime = System.currentTimeMillis();
//        // 박살난 버튼 저장
//        for (int i = 0; i < brokenButtonTotal; i++) {
//            brokenButton.append(in.next());
//        }
//
//        for (int i = 0; i < 1000001; i++) {
//            boolean Flag = false;
//            if (endChannel.equals("100")) {
//                buttonClick = 0;
//                break;
//            }
//            for (int j = 0; j < brokenButton.length(); j++) {
//                StringBuilder tmpSB = new StringBuilder();
//                tmpSB.append(brokenButton.charAt(j));       //StringBuilder 의 charsequence 는 char로 어케 수정할것인가  // 이게 최선인가? (비교할 숫자 )
//                if ((String.valueOf(i).contains(tmpSB))) {    // 여기서 왜 i 를 원하는 값을 걸러내지 못하냐  // 잘걸러내더라     하나라도 박살난 버튼이 있다면 다음 수로
//                    Flag = true;
//                }
//            }
//            if (!Flag) {                // 박살난 버튼 숫자가 없다면
//                int tmpAbs = Math.abs(Integer.parseInt(endChannel) - i);
//                if (buttonClick > tmpAbs) {
//                    buttonClick = tmpAbs;
//                    minOfBtn= String.valueOf(i);
//                }
//            }
//        }
//        buttonClick += minOfBtn.length();  //1221 오류 발견 숫자 하나씩 더 추가 될 경우를 발견 // 어째서 수정해도 틀리는 것인가?
//        System.out.println(buttonClick);   //백준 입력 예시 다 맞게 출력되지만 제출하면 틀림,,,,,
//        //long endTime = System.currentTimeMillis();
//        //System.out.println(endTime-startTime);
    }

}

