package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1063_두정수입력받아큰수출력하기 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.printf("%d", a>b ? a:b);        
    }
}
