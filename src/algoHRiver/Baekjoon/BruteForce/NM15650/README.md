# 1차 풀이
- 15649 번 문제와 유사해서 비슷하게 작성 후, 조건으로 `  if(numArray[index-1]<numArray[index])` 을 추가하여 오름 차순이 되도록 저장하게 했다.

- 값 비교를 통해 오름차순을 해야 하기 때문에 이 전 문제와 다르게 numArray에 숫자를 0으로 초기화 하는 과정을 추가 했다.

```agsl
if(numArray[index-1]<numArray[index]) {
                    index++;
                    recur(index, n, m);
                }
                    index--;
```
- 코드가 index를 이렇게 작성 할 때는 안되지만 아래와 같이 바꾸면 원하는 결과가 나온다.
  - if 문 조건에 해당 하지 않으면 index++; 이 동작하지 않기 때문이다. 이런 실수를 없애자

```agsl
package algoHRiver.Baekjoon.BruteForce.NM15650;

import java.util.Scanner;

// https://www.acmicpc.net/problem/15650
public class P15650 {

    static int[] numArray = new int[11];
    static boolean[] boolArray = new boolean[11];

    public static void recur(int index,int n,int m){
        if(index==m+1){
            for (int i = 1; i <= m ; i++) {
                System.out.print(numArray[i]+" ");
            }
            System.out.println();
        }
        else{
            for (int i = 1; i <= n; i++) {
                if(boolArray[index]) {continue;}

                    numArray[index] = i;
                    boolArray[index] = true;
                if(numArray[index-1]<numArray[index]) {
                    recur(index+1, n, m);
                }
                    boolArray[index] = false;
                    numArray[index] = 0;

            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int m= in.nextInt();

        recur(1,n,m);
    }
}

```