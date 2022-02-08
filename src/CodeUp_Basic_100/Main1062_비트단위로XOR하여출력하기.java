package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1062_비트단위로XOR하여출력하기 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.printf("%d", a^b);        
    }
}
