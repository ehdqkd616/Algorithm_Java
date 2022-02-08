package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1055_하나라도참이면참출력하기 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a == 1 || b == 1) {        	
        	System.out.print(1);
        }else {        	
        	System.out.print(0);
        }
    }
}
