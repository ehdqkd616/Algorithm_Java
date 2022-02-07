package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1049_두정수입력받아비교하기1 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        
        if(firstNum > secondNum) {        	
        	System.out.print(1);
        }else {        	
        	System.out.print(0);
        }
    }
}
