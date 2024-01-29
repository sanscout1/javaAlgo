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
