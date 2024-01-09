# 1차 풀이

```agsl
package algoHRiver.Baekjoon.BruteForce.NM15651;

import java.util.Scanner;

public class P15651 {

    static StringBuilder tmpArray = new StringBuilder();

    public static void recur(int index, int m, int n) {
        if (index == n) {
                System.out.println(tmpArray);
        } else {
            for (int i = 1; i <= m; i++) {
                StringBuilder tmp =tmpArray;
                tmpArray.append(i).append(" ");
                index++;
                recur(index, m, n);
                index--;
                tmpArray.delete(index,index+2);
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int index = 0;
        recur(index, m, n);


    }
}

```

- 처음에는 int출력을 했더니 시간초과, String을 활용하니 또 시간초과, 결국에 StringBuilder를 이용하니 답이 안나온다. 큰 수정이 필요하다.

