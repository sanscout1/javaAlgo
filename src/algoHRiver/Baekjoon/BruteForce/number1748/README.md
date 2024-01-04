https://www.acmicpc.net/problem/1748

## 1차 풀이
```agsl
public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder output= new StringBuilder();
        int loopI = in.nextInt();
        for (int i = 1; i < loopI+1; i++) {
            output.append(i);
        }
        System.out.println(output.length());
    }
```
메모리 부족 발생;;; 다시 풀어야한다

## 2차 풀이
```agsl

        while(tmpNum>0){
            if(tmpNum/10 >= 1){  // 십의자리 수가 하나가 더 크다면 그 사이에 숫자들의 자릿수 만큼 다 더하고
                output+= 9*count*tenNum;
                tmpNum3 += 9*tenNum;
            }
            else{  // 아니라면 지금까지 더한 숫자들을 뺴고 남은 숫자의 자릿수 만큼 더하기
                output+= (tmpNum2-tmpNum3)*count;
            }
            count++;
            tenNum*=10;
            tmpNum/=10;
        }
```

##  답지 비교
```agsl
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int start=1, len=1; start<=n; start*=10, len++) {
            int end = start*10-1;
            if (end > n) {
                end = n;
            }
            ans += (long)(end - start + 1) * len;
        }
        System.out.println(ans);
    }
}
```

나는 변수를 엄청 많이 이용해서 풀었지만 답지는 거의 사용하지 않고, for문 하나로 해결 했다.

수의 자리수별로 나누어서 문제를 해결할 수 있다.
- N = 120
-  1 - 9    (9-1+1) * 1
-  10 - 99  (99-10+1) * 2
-  100 - 120  (120-100+1) * 3

패턴을 찾는 연습을 해야한다.