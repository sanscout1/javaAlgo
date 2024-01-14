# 1차 풀이

조건을 고려하지 않고 유사하게 출력나오도록 작성, 중복되는 숫자가 출력 나오는 것을 확인

# 2차 풀이
`tmpArray` 의 index 앞뒤 값 비교를 통해 다른 숫자가 나오게 출력 시도
- 바로 앞뒤만 비교해서 세 번째 인덱스에서 첫 번째 인덱스 값 출력을 확인

# 3차 풀이
`tmpBoolArray` 을 추가해서 사용한 숫자는 false 가 되도록 번경
```agsl
tmpArray[index] = inputArrays[i];
            if(tmpBoolArray[i]) {
                tmpBoolArray[i] = false;
                recur(++index, n, m, inputArrays);
                index--;
                tmpBoolArray[i] = true;
            }
            tmpArray[index]=0;

```

tmpBoolArray 를 if문 밖에 설정해서 값 출력이 제대로 안나오는 것을 확인
- 메서드 호출 구간을 잘 배치하는 연습을 더욱 더 해서 풀이 시간을 단축하자
