package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1051_두정수입력받아비교하기3 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a <= b) {        	
        	System.out.print(1);
        }else {        	
        	System.out.print(0);
        }
    }
}
