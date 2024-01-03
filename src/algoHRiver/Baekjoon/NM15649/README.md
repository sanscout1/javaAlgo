# 1차 풀이

```agsl
package algoHRiver.Baekjoon.NM15649;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/15649
public class P15649 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int m = in.nextInt();
        int print = m;
        int[] tmpArray = new int[m];
        int index=0;
        recur(tmpArray,index,n,m,print);
    }


    public static void recur(int[] tmpArray,int index,int n,int m,int print){
        boolean flag=false;
        if(m>0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <=index ; j++) {
                    if(tmpArray[j]==i){
                        flag=true;
                    }
                }
                if(!flag) {
                    m--;
                    tmpArray[index] = i;
                    index++;
                    recur(tmpArray, index, n, m, print);
                    index--;
                    m++;
                }
                flag=false;
            }
        }
        if(m==0){
            for (int i = 0; i < print; i++) {
                System.out.print(tmpArray[i]+" ");
            }
            System.out.println();
        }
    }



}

```

- 입력 예제에 출력은 제대로 나오지만 틀렸다고 나온다. 예외를 알아내야한다.
- 재귀함수를 너무 어렵게 만들었다. 시행착오가 너무 많고 오래걸렸다. 쉽게 만드는 방법을 생각해야한다.
- 4 3  입력 시 (4,1,2) 가 출력 안되는 것 발견
  - tmpArray 에 2가 남아있어서 2를 스킵하고 4,1,3 을 출력
  - int tmpArray 배열에 사용한 수를 저장하고 사용여부를 검색하기 때문에, 배열을 초기화를 하고 사용하는 것이 아니라서 오류 발생

# 2차 풀이
1. 배열들을 static으로 만들어서 인수값 2개 감소
2. 같은 숫자 안나오게 하는 것을 
3. bool 배열을 이용하여 사용한 것을 체크하기 때문에 위에서 발생한 오류 없음
