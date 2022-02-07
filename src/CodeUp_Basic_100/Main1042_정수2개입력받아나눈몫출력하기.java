package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1042_정수2개입력받아나눈몫출력하기 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.printf("%d", a/b);
    }
}
