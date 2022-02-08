package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1048_한번에2의거듭제곱배로출력하기 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        int power = sc.nextInt();
        
        for(int i = 0; i < power; i++) {
        	iNum *= 2;
        }
        
        System.out.printf("%d", iNum);
    }
}
