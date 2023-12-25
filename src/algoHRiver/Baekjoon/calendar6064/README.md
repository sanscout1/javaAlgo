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