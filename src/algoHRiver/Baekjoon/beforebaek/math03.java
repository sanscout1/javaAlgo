//https://www.acmicpc.net/problem/17427

package algoHRiver.Baekjoon.beforebaek;
import java.util.Scanner;
public class math03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans=0;    //범위가 커서 int 보다 더큰 숫자로 (백만 넘는 합들 나오면 long 고려)
        for(int i =1;i<n+1;i++){
            ans += (n/i)*i;
        }
        System.out.println(ans);
    }
}
