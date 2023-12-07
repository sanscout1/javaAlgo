package algoHRiver;
//https://www.acmicpc.net/problem/2309
import java.util.*;
public class brute01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum =0;
        int[] a = new int[9];
        for (int i=0; i<9;i++) {
             a[i]=sc.nextInt();
             sum+=a[i];
        }

        Arrays.sort(a);

        for (int i=0;i<8;i++){
            for (int j=1;j<9;j++){
                if(sum-a[i]-a[j]==100){
                    for (int x=0; x<9; x++){
                        if((a[x]!=a[i])&&(a[x]!=a[j])) {
                            System.out.println(a[x]);
                        }
                    }
                    System.exit(0);

                }
            }
        }



    }
}
