# 1차 풀이 성공

```agsl
for (int i = 1; i <= n; i++) {
            tmpArray[index] = i;
            if (tmpArray[index]>= tmpArray[index-1]) {

                recur(++index, n, m);
                index--;

            }
        }
```

- 이전 배열에 저장한 값보다 크다면 출력하도록 반복, 이전 n,m 문제에 비하면 쉬운 난이도 문제다.