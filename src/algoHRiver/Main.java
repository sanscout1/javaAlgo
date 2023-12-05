package algoHRiver;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        if (s>=e){
            for(int j=1;j<10; j++){
                for(int i=s; i>=e; i--){

                    System.out.print(i+" * "+j+" = "+(i*j)+"   ");

                }
                System.out.print("\n");
            }
        }

        else {
            for(int j=1;j<10; j++){
                for(int i=s; i<=e; i--){

                    System.out.print(i+" * "+j+" = "+(i*j)+"   ");

                }
                System.out.print("\n");
            }
        }
    }
}