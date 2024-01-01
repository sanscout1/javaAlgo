package algoHRiver.Baekjoon.number1748;

import java.util.Scanner;

public class P1748 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int output=0;
        int tmpNum = in.nextInt();
        int tmpNum2 = tmpNum;
        int tmpNum3 = 0;
        int count = 1;
        int tenNum =1;

        // 10 --> 9  100 --> 90*2  1000 --> 900*3

        while(tmpNum>0){
            if(tmpNum/10 >= 1){
                output+= 9*count*tenNum;
                tmpNum3 += 9*tenNum;
            }
            else{
                output+= (tmpNum2-tmpNum3)*count;
            }
            count++;
            tenNum*=10;
            tmpNum/=10;
        }

        System.out.println(output);
    }
}
