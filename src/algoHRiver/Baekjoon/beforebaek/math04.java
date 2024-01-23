
//https://www.acmicpc.net/problem/17425
//https://m.blog.naver.com/ka28/221850826909

package algoHRiver.Baekjoon.beforebaek;

import java.util.*;
import java.io.*;
public class math04 {
    static final int MAX=1000000;

    public static void main(String[] args) throws IOException {

// scanner 로는 시간 넘어감,,, buffer 사용해야함

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] d = new long[MAX+1];
        for (int i=1; i<=MAX; i++) {
            d[i] = 1;
        }
        for (int i=2; i<=MAX; i++) {
            for (int j=1; i*j<=MAX; j++) {
                d[i*j] += i;
            }
        }
        long[] s = new long[MAX+1];
        for (int i=1; i<=MAX; i++) {
            s[i] = s[i-1] + d[i];
        }
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(s[n]+"\n");
        }
        bw.flush();
    }

//
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        long[] d = new long[MAX+1];
//        long[] s = new long[MAX+1];
//        for (int i=1;i<MAX+1;i++){
//            d[i]=1;
//        }
//        for (int i =2;i<MAX+1;i++){
//            for (int j=1;i*j<MAX+1;j++){
//                d[i*j]+=i;
//            }
//        }
//
//        for(int i =1;i<MAX+1;i++){
//            s[i]=s[i-1]+d[i];
//        }
//
//        for (int i=0;i<T;i++){
//            int ia =sc.nextInt();
//            System.out.println(s[ia]);
//        }





//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        int[] a=new int[T];
//        long[] total=new long[T];
//        for(int i = 0; i<T; i++){
//            a[i]=sc.nextInt();
//            for(int j = 1; j<a[i]+1; j++){
//                total[i]+= (a[i]/j)*j;
//            }
//        }
//
//        for (int k=0; k<T; k++){
//            System.out.println(total[k]);
//        }

    }

