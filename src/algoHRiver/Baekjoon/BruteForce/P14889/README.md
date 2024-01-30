# 1차 풀이
```agsl
package algoHRiver.Baekjoon.BruteForce.P14889;

import java.util.Scanner;

import static java.lang.Math.abs;

public class P14889 {
    static int[][] tmpArray;
    static int link =0;

    static int n;
    static int ans=10000000;



    static boolean[] tmpbool;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        tmpArray= new int[n+1][n+1];
        tmpbool=new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                tmpArray[i][j]= sc.nextInt();
            }
        }
        func(0,0);
        System.out.println(ans);
    }
    public static void func(int index,int start){

        if(index == n/2){
            if(ans>abs(link-start)){
                ans=abs(link-start);
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i==j){continue;}
                if(!tmpbool[j] && !tmpbool[i])
                 {
                    tmpbool[i] = true;
                    tmpbool[j] = true;
                    link = link  + tmpArray[i][j]+ tmpArray[j][i];
                    func(index+2,start + tmpArray[i][j]+ tmpArray[j][i]);
                     link = link  - tmpArray[i][j] - tmpArray[j][i];
                    tmpbool[i] = false;
                    tmpbool[j] = false;
                }
            }
        }
    }
}

```

- 점점 논리에 비해 코드가 복잡해져서 수정이 힘들어져서 다시 작성 할 필요가 있다.
- 숫자를 2개씩 골라서 코드를 선택해서 새로 선택한 수와 기존 선택한 수의 값을 추가하지 못한다.

# 2차 풀이
```agsl
package algoHRiver.Baekjoon.BruteForce.P14889;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class P14889 {
    static int[][] tmpArray;


    static int n;
    static int ans = Integer.MAX_VALUE;
    static boolean[] tmpbool;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tmpArray = new int[n][n];
        tmpbool = new boolean[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                tmpArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        func(0,0);
        System.out.println(ans);
    }

    public static void func(int index,int count) {

        if (count == n / 2) {
            func1();
            return;
        }
        for (int i = index; i < n; i++) {
            if (!tmpbool[i]) {
                tmpbool[i] = true;
                func(i + 1,count+1);
                tmpbool[i] = false;
            }
        }
    }
    public static void func1(){
        int link = 0;
        int start = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!tmpbool[j] && !tmpbool[i]) {
                    link = link + tmpArray[i][j] + tmpArray[j][i];
                }
                if (tmpbool[j] && tmpbool[i]) {
                    start = start + tmpArray[i][j] + tmpArray[j][i];
                }
            }
        }
        int diff= Math.abs(start-link);
        if (diff == 0) {
            System.out.println(diff);
            System.exit(0);
        }
        ans=Math.min(ans,diff);
    }
}


```

- 팀은 2개이니 true 인 팀과 false 인 팀으로 분할해서 생각하면 된다.
- 이중 포문으로 시간이 초과하는 것으로 부터 살아남기 위하여 경우의 수를 최소화를 하기 위해 노력해야한다.
