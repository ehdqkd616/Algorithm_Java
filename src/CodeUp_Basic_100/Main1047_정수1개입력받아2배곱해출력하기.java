package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1047_정수1개입력받아2배곱해출력하기 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        
        System.out.printf("%d", iNum*2);
    }
}
