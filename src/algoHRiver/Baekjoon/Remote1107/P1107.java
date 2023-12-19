package algoHRiver.Baekjoon.Remote1107;

// https://www.acmicpc.net/problem/1107

import java.util.Scanner;

public class P1107 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int buttonClick = 1000000;
        String endChannel = in.nextLine();
        int brokenButtonTotal = in.nextInt();
        StringBuilder brokenButton = new StringBuilder();

        // 박살난 버튼 저장
        for (int i = 0; i < brokenButtonTotal; i++) {
            brokenButton.append(in.next());
        }

        for (int i = 0; i < 1000000; i++) {
            boolean Flag = false;
            if (endChannel.equals("100")) {
                buttonClick = 0;
                break;
            }
            for (int j = 0; j < brokenButton.length(); j++) {
                StringBuilder tmpSB = new StringBuilder();
                tmpSB.append(brokenButton.charAt(j));       //StringBuilder 의 charsequence 는 char로 어케 수정할것인가  // 이게 최선인가? (비교할 숫자 )
                if ((String.valueOf(i).contains(tmpSB))) {    // 여기서 왜 i 를 원하는 값을 걸러내지 못하냐  // 잘걸러내더라     하나라도 박살난 버튼이 있다면 다음 수로
                    Flag = true;
                }
            }
            if (!Flag) {                // 박살난 버튼 숫자가 없다면
                int tmpAbs = Math.abs(Integer.parseInt(endChannel) - i);
                if (buttonClick > tmpAbs) {
                    buttonClick = tmpAbs;
                }
            }
        }
        buttonClick += endChannel.length();
        System.out.println(buttonClick);   //백준 입력 예시 다 맞게 출력되지만 제출하면 틀림,,,,,
    }

}

