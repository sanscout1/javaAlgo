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

# 2차 풀이
```agsl
package algoHRiver.Baekjoon.BruteForce.NM15651;

import java.util.Arrays;
import java.util.Scanner;

public class P15651 {

    static StringBuilder tmpArray = new StringBuilder();
    static int[] tmpArrayInt = new int[11];

    public static void recur(int index, int m, int n) {
        if (index == n) {

            for (int i = 0; i < n; i++) {
                tmpArray.append(tmpArrayInt[i]).append(" ");
            }
            tmpArray.append("\n");

        } else {
            for (int i = 1; i <= m; i++) {

                tmpArrayInt[index]=i;
                index++;
                recur(index, m, n);
                index--;

            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int index = 0;
        recur(index, m, n);
        System.out.println(tmpArray);

    }
}

```

- 출력은 같으나 위와 아래 코드 출력속도는 매우 차이가 난다.

```agsl
package algoHRiver.Baekjoon.BruteForce.NM15651;

import java.util.Arrays;
import java.util.Scanner;

public class P15651 {

    static StringBuilder tmpArray;
    static int[] tmpArrayInt = new int[11];

    public static void recur(int index, int m, int n) {
        if (index == n) {
            tmpArray = new StringBuilder();
            for (int i = 0; i < n; i++) {
                tmpArray.append(tmpArrayInt[i]).append(" ");
            }
            System.out.println(tmpArray);
        } else {
            for (int i = 1; i <= m; i++) {

                tmpArrayInt[index]=i;
                index++;
                recur(index, m, n);
                index--;

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

- println은 내부적으로 동기화가 적용 - 오버헤드가 발생하여 시간이 매우 증가
- 

