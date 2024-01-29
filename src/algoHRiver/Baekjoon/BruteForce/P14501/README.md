# 1차 풀이
```agsl
package algoHRiver.Baekjoon.BruteForce.P14501;

import java.util.Scanner;




public class P14501 {

    static int ans=0;
    static int tmpans=0;
    static int tmpnum=1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int[] useDays = new int[n];
        int[] getPay = new int[n];

        for (int i = 0; i < n; i++) {
            useDays[i] = Integer.parseInt(scanner.next());
            getPay[i] = Integer.parseInt(scanner.next());
        }
        func(1,n,getPay,useDays);
        System.out.println(ans);


    }

    public static void func(int index,int n , int[] getPay , int[] useDays) {
        for (int i = index-1; i < n; i++) {
            tmpnum+=useDays[i];
            tmpans += getPay[i];

            if(tmpnum==n+1){
                if(tmpans>ans){
                    ans = tmpans;
                }
                return;
            }
            else if(tmpnum>n+1){
                tmpnum-=useDays[i];
                tmpans -= getPay[i];
                if(tmpnum==n+1){
                    if(tmpans>ans){
                        ans = tmpans;
                    }
                    return;
                }
                tmpnum++;
            }
            else {
                func(tmpnum,n,getPay,useDays);
                tmpnum-=useDays[i];
                tmpans -= getPay[i];
                tmpnum++;
            }



        }
    }
}

```

- 일수를 더하는 과정에서 논리적 오류가 존재해서 정답이 안나오는 것으로 보여서 수정이 필요하다.

# 2차 풀이
```agsl
package algoHRiver.Baekjoon.BruteForce.P14501;

import java.util.Scanner;


public class P14501 {
    static int n;
    static int ans = 0;
    static int[] useDays;
    static int[] getPay;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        useDays = new int[n + 1];
        getPay = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            useDays[i] = scanner.nextInt();
            getPay[i] = scanner.nextInt();
        }
        func(1, 0);
        System.out.println(ans);


    }

    public static void func(int day, int sum) {

        if (day == n + 1) {
            if (sum > ans) {
                ans = sum;
            }
            return;
        }
        if (day > n + 1) {
            return;
        }
        func(day+1, sum);
        func(day + useDays[day], sum + getPay[day]);


    }
}

```
- 간단하게 재귀함수를 하루 그냥 보낸 케이스와 당일 업무를 한 케이스를 2개 돌리면 답에 접근 할수 있다.