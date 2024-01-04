# 백준 1107 리모컨 풀이

~~어째서 예제 입력을 넣으면 출력이 잘나오는데 제출만 하면 틀린다고 나오는 것인가~~



### Brute force 활용 문제

- 문제를 보고 처음에는 접근을 고장 난 버튼 기준으로 그 자릿수에 숫자에서 앞뒤로 1씩 늘리는 방법을 생각했다.
- 하지만 조건을 하나하나 따지기 시작하니 너무 복잡해지게 되었고, brute force 의 정의를 다시 되새겨보았다.
- 시간 복잡도 n이라면 문제가 없을 거라 생각하여 반복을 1000000 을 통하여 최소값을 찾기로 하였다.


`int buttonClick = 1000000;`
- 버튼을 누른 최소 수를 구하는 것이 목표 --> buttonClick 변수를 큰 수로 설정

```agsl
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

***

### 새로운 풀이

- 어떤 입력예제에서 문제가 생긴 것인지 알 수가 없어서 이번에는 문자열이 아닌 숫자만으로 풀어 보기로 시도

```agsl
int brokenButtonTotal = in.nextInt();    //고장난 버튼 등록
for (int i = 0; i < brokenButtonTotal; i++) {
brokenButtons[in.nextInt()] = true;
}
```

- 고장난 버튼은 동일하게 저장
***
`int buttonClick = Math.abs(endChannel - 100);`
- 시작이 100이기 때문에, 도착 숫자가 100인 경우 버튼 클릭을 0인 것을 정의
***
```agsl
 if (tmpNum == 0) {
                if (!brokenButtons[0]) {
                    anslength = 1;
                }
            }
```
- 0 인 경우에는 나눌 수 없어서 길이 추가를 할 수 없어서 예외적으로 처리
***
```agsl
 while (tmpNum > 0) {
                if (brokenButtons[tmpNum % 10]) {
                    flag = false;
                    break;
                }
                anslength++;
                tmpNum /= 10;
            }
```
- 각 자리 마다 고장 난 버튼을 사용하는 지 확인 후, 아니라면 답에 길이 값을 1씩 증가 (처음에 숫자 버튼 누른 수)

***
```agsl
if (flag) {
                if (anslength > 0) {
                    tmpNum = Math.abs(i - endChannel);
                    if (tmpNum >= 0) {                      // 1222 10:56   endchannel : 1, 고장난 버튼 0 뺴고 모두일 때, 100에서 접근해서 99가 나오는중
                        if (buttonClick > anslength + tmpNum) {
                            buttonClick = anslength + tmpNum;
                        }
                    }
                }
            }
```
- buttonclick에 검색하면서 나온 최소 값을 비교하며 저장





