package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1045_정수2개입력받아자동계산하기 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        
        System.out.printf("%d\n", firstNum+secondNum);
        System.out.printf("%d\n", firstNum-secondNum);
        System.out.printf("%d\n", firstNum*secondNum);
        System.out.printf("%d\n", firstNum/secondNum);
        System.out.printf("%d\n", firstNum%secondNum);
        System.out.printf("%.2f\n", (float)firstNum/secondNum);
    }
}
