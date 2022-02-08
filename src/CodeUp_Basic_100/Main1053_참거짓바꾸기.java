package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1053_참거짓바꾸기 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        
        if(iNum == 0) {        	
        	System.out.print(1);
        }else if(iNum == 1){        	
        	System.out.print(0);
        }
    }
}
