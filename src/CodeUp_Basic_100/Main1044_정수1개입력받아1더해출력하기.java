package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1044_정수1개입력받아1더해출력하기 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        long lNum = sc.nextLong();
        
        System.out.printf("%d", lNum+1);
    }
}
