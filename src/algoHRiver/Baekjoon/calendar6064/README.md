### 1차 풀이
- 처음에 답이 될 수 없는 경우를 찾고, 가능하다면 x는 유지하고 x의 최대 저장 가능 값을 더하며 찾아냈을려 했으나 백준에서 거부했다.

```agsl


        int[] realYear = new int[T];

        for (int i = 0; i < T; i++) {

            int endXNum = in.nextInt();
            int endYNum = in.nextInt();
            int ansXNum = in.nextInt();
            int ansYNum = in.nextInt();



            // 3 3 ,3 1, 3 11  x가 y 보다 작은 만큼 x값이 정답에 돌아올때마다 y값은 감소

            // 5 5 , 5 7  ,5 9   x가 y보다 큰만큼 y 는 x값이 정답에 돌아올때마다 증가


            //답에 접근 가능한지 확인
            int diffXY = endXNum-endYNum;
            ArrayList<Integer> tmpCheck = new ArrayList<>();
            int tmpCheckNumber = ansXNum;
            realYear[i] =ansXNum;
            if(endYNum>ansXNum) {
                tmpCheck.add(ansXNum);

            }
            else {
                realYear[i]=-1;
            }
            //


            while(realYear[i]>0){
                if(tmpCheckNumber==ansYNum){
                    break;
                }

                tmpCheckNumber+=diffXY;
                realYear[i] +=endXNum;
                if(tmpCheckNumber<0){
                    tmpCheckNumber+=endYNum;
                } else if (tmpCheckNumber>endYNum) {
                    tmpCheckNumber-=endYNum;
                }
                if(tmpCheck.contains(tmpCheckNumber)){
                    realYear[i]= -1;
                    break;
                }
                tmpCheck.add(tmpCheckNumber);
            }
            //

        }
        for (int i = 0; i < T; i++) {
            System.out.println(realYear[i]);
        }

```


### 2차 풀이

- 코드가 너무 길어져서 내 코드임에도 이해하기 너무 어려워져 새로 짜기 시작
- 똑같이 앞에 달력 x 를 고정하여 (ansXNum), x 범위 값 (endXNum)을 계속 더하여 답에 맞는 y 찾기.
- 입력값에서 1씩 빼고 나머지 연산하기 -->` for (int j = ansXNum; j < endXNum * endYNum; j += endXNum) `
 ` j % endYNum == ansYNum`  ,  1부터 시작하면 연산 결과가 0인 경우 발생 --> 달력은 1부터 시작한다.
- 그 후 출력 때 j에 1을 더해서 출력한ㄷ (입력 할 때 1씩 뺏기 때문이다.)