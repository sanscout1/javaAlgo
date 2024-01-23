# 1차 풀이

```agsl
package algoHRiver.Baekjoon.BruteForce.NMK18290;

import java.util.Scanner;

public class P18290 {
    static int tmpans=0;
    static int ans =0;
    static int kans =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] intnm = new int[n+2][m+2];
        boolean[][] boolnm = new boolean[n+2][m+2];
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                intnm[i][j] = sc.nextInt();
            }
        }

        recur(intnm,boolnm,n,m,k);
        System.out.println(ans);

    }
    public static void recur(int[][] intnm ,boolean[][] boolnm,int n,int m,int k){

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(kans == k) {
                    if(ans < tmpans)
                    {
                        ans = tmpans;
                    }
                    return;
                }
               if (!boolnm[i][j]){
                   tmpans+=intnm[i][j];
                   kans++;
                   //테두리 일때 boolean 오류안나게 고려하기
                   // 그냥 조건은 하나만 만들고 메모리를 크게 만들어보자
                   boolnm[i][j] = true;
                   boolnm[i - 1][j] = true;
                   boolnm[i + 1][j] = true;
                   boolnm[i][j - 1] = true;
                   boolnm[i][j + 1] = true;
                   recur(intnm,boolnm,n,m,k);
                   tmpans-=intnm[i][j];
                   kans--;
                   boolnm[i][j]=false;
                   boolnm[i - 1][j] = false;
                   boolnm[i + 1][j] = false;
                   boolnm[i][j - 1] = false;
                   boolnm[i][j + 1] = false;
               }

            }
        }

    }
}

```

- 예제입력 2 의 경우 출력이 5가 나와야 하지만 8 이 나온다.
- 다른 경우네느 옳게 나온다.
- bool 배열에 true가 정상적으로 작동하지 않는 것을 확인 수정이 필요하다.

# 2차 풀이
```agsl
package algoHRiver.Baekjoon.BruteForce.NMK18290;

import java.util.Scanner;

public class P18290 {
    static int tmpans=0;
    static int ans =0;
    static int kans =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] intnm = new int[n+4][m+4];
        boolean[][] boolnm = new boolean[n+4][m+4];
        for (int i = 2; i < n+2; i++) {
            for (int j = 2; j < m+2; j++) {
                intnm[i][j] = sc.nextInt();
            }
        }

        recur(intnm,boolnm,n,m,k);
        System.out.println(ans);

    }
    public static void recur(int[][] intnm ,boolean[][] boolnm,int n,int m,int k){

        for (int i = 2; i < n+2; i++) {
            for (int j = 2; j < m+2; j++) {
                if(kans == k) {
                    if(ans < tmpans)
                    {
                        ans = tmpans;
                    }
                    return;
                }
                if (!boolnm[i][j]){
                    tmpans+=intnm[i][j];
                    kans++;
                    boolnm[i][j] = true;
                    boolnm[i - 1][j] = true;
                    boolnm[i + 1][j] = true;
                    boolnm[i][j - 1] = true;
                    boolnm[i][j + 1] = true;
                    recur(intnm,boolnm,n,m,k);
                    tmpans-=intnm[i][j];
                    kans--;
                    boolnm[i][j]=false;
                    boolnm[i - 1][j] = false;
                    boolnm[i + 1][j] = false;
                    boolnm[i][j - 1] = false;
                    boolnm[i][j + 1] = false;
                    for (int l = -1; l < 2; l++) {
                        for (int o = -1; o < 2; o++) {
                            if(boolnm[i + l][j + o]){
                                boolnm[i + l -1][j + o] = true;
                                boolnm[i + l +1][j + o] = true;
                                boolnm[i + l ][j + o -1] = true;
                                boolnm[i + l ][j + o +1] = true;
                            }
                        }
                    }
                }

            }
        }

    }
}
```

- bool 오류를 해결하기 위하여 false 로 바꿔 준 후에, 주변에 true 인 값이 있다면, 그 true 값 기준으로 주변을 다시 true로 회복을 시도해 보았지만, 어딘가 오류가 있는지 예제 입력 4의 결과가 27이 아닌 18이 나온다.

# 2차 풀이
```agsl
package algoHRiver.Baekjoon.BruteForce.NMK18290;

import java.util.Scanner;

public class P18290 {
    static int tmpans=0;
        static int ans = Integer.MIN_VALUE;
    static int kans =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] intnm = new int[n+4][m+4];
        boolean[][] boolnm = new boolean[n+4][m+4];
        for (int i = 2; i < n+2; i++) {
            for (int j = 2; j < m+2; j++) {
                intnm[i][j] = sc.nextInt();
            }
        }

        recur(intnm,boolnm,n,m,k);
        System.out.println(ans);

    }
    public static void recur(int[][] intnm ,boolean[][] boolnm,int n,int m,int k){
        if(kans == k) {
            if(ans < tmpans)
            {
                ans = tmpans;
            }
            return;
        }
        for (int i = 2; i < n+2; i++) {
            for (int j = 2; j < m+2; j++) {
                if (boolnm[i][j]){
                    continue;
                }
                if (!boolnm[i][j]&& !boolnm[i - 1][j] &&
                !boolnm[i + 1][j] &&
                !boolnm[i][j - 1] &&
                !boolnm[i][j + 1] ){
                    tmpans+=intnm[i][j];
                    kans++;
                    boolnm[i][j] = true;

                    recur(intnm,boolnm,n,m,k);
                    tmpans-=intnm[i][j];
                    kans--;
                    boolnm[i][j]=false;



                }

            }
        }

    }
}
```
1. -값도 사용 하기 때문에, ans에 int가 저장 가능한 최저값을 저장하자
2. boolean 비교를 주변을 바꾸는 것이 아닌 자기 자신만을 바꾸고, 검색할 때를 주변으로 하도록 하니 오류가 발생하지 않는다.
