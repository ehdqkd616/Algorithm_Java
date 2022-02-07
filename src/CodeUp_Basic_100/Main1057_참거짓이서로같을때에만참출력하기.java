package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1056_참거짓이서로다를때에만참출력하기 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if((a==1 && b==0) || (a==0 && b==1)) {        	
        	System.out.print(1);
        }else {        	
        	System.out.print(0);
        }
    }
}
