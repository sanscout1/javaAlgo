# 1차 풀이
```agsl
public static void recur(int index, int[] intArray, int n , int m){
        if(index==m+1){
            for (int i = 1; i < m+1; i++) {
                sb.append(ansArray[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        else{

            for (int i = 0; i < n; i++) {
                ansArray[index]=intArray[i];
                if(ansArray[index]>=ansArray[index-1]) {

                    recur(++index, intArray, n, m);
                    index--;
                }
            }

        }
```
- 중복허용을 하는 것과 경우의 수가 너무 많아서 StringBuilder를 활용하기로 하고 코드 작성
- 같은 유형 문제만 푸는 연습의 결실이 나왔다.