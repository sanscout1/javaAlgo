# 백준 1107 리모컨 풀이

~~어째서 예제 입력을 넣으면 출력이 잘나오는데 제출만 하면 틀린다고 나오는 것인가~~



### Brute force 활용 문제


`int buttonClick = 1000000;`
- 버튼을 누른 최소 수를 구하는 것이 목표 --> buttonClick 변수를 큰 수로 설정

```
for (int j = 0; j < brokenButton.length(); j++) {
                StringBuilder tmpSB = new StringBuilder();
                tmpSB.append(brokenButton.charAt(j));     
                if ((String.valueOf(i).contains(tmpSB))) {    
                    Flag = true;
                }
            }
```
- 고장난 버튼을 저장하여서 우리가 누를 수 있는 숫자 모든 경우의 수 중 고장난 버튼이 포함된 경우만 제외
    - 모든 경우의 수에서 자리마다 고장난 버튼 숫자가 포함될 수 있으니 문자열로 비교 처리

`buttonClick += endChannel.length();`
- 마지막으로 접근 할때 누르는 버튼의 갯수를 더해서 값을 도출

`if (endChannel.equals("100")) { buttonClick = 0;}`
- 예외적으로 목표 값이 100 일떄는 답이 0 이 나오도록 처리 (시작값이 100이기 때문이다)



