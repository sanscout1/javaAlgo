package algoHRiver.Baekjoon.beforebaek;
//https://gyuwon95.tistory.com/48
import java.io.*;
import java.util.StringTokenizer;

public class brute03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(bf.readLine());

        int a =Integer.parseInt(st.nextToken());
        int b =Integer.parseInt(st.nextToken());
        int c =Integer.parseInt(st.nextToken());

        int e=1;
        int s=1;
        int m=1;
        int cnt=1;

        while(true){
            if(a==e && b==s && c==m ){
                System.out.println(cnt);
                bw.flush();
                break;
            }

            cnt++;
            e++;
            s++;
            m++;

            if(e==16){
                e=1;
            }
            if (s==29){
                s=1;
            }
            if(m==20){
                m=1;
            }
        }

    }
}
