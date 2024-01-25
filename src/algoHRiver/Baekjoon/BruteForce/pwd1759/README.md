# 1차 풀이

```agsl
package algoHRiver.Baekjoon.BruteForce.pwd1759;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1759
public class P1759 {
    public static char[] tmpArray = new char[20];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        int c = sc.nextInt();
        char[] charArray = new char[c];
        for (int i = 0; i < c; i++) {
                charArray[i] = sc.next().charAt(0);
        }
        Arrays.sort(charArray);
        recur(1,l,c,charArray);
        System.out.println(sb);
    }

    public static void recur(int index, int l, int c, char[] charArray){
        if(index == l+1){
            
            for (int i = 1; i < l+1; i++) {
                sb.append(tmpArray[i]);
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < c; i++) {

            if (charArray[i] > tmpArray[index-1]) {
                tmpArray[index] = charArray[i];
                index++;
                recur(index, l, c, charArray);
                index--;
                tmpArray[index] =' ';
            }

        }


    }


}

```
- 원하는대로 오름차순으로 저장 출력 했지만 예제 출력과 비교해보니 차이가 있었다.
- 문제에서 최소 모음 1개, 최소 자음 2개라는 조건을 지금 보아서 수정이 필요하다.

# 2차 풀이

```agsl
if(index == l+1){
            int countV =0;  //모음
            int countC =0;
            for (int i = 1; i < l+1; i++) {
                if(tmpArray[i]=='a' || tmpArray[i]=='e'|| tmpArray[i]=='i'|| tmpArray[i]=='o'|| tmpArray[i]=='u')
                {
                    countV++;
                } else {
                    countC++;
                }
            }
```
- 모음과 자음 개수를 확인하는 조건문을 추가하여 정답


