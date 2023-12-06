package algoHRiver;
import java.util.*;

//https://www.acmicpc.net/problem/2609
public class math05 {
    public static int GCD(int a,int b) {
        if(b==0){
            return a;
        }
        else {
            return GCD(b,a%b);
        }
    }
    public static void main(String[] args) {





        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c=GCD(a,b);
        System.out.println(c);

        System.out.println(a*b/c);

    }
}
