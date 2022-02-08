package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1046_정수3개입력받아합과평균출력하기 { 

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int thirdNum = sc.nextInt();
        
        System.out.printf("%d\n", firstNum+secondNum+thirdNum);
        System.out.printf("%.1f\n", (float)(firstNum+secondNum+thirdNum)/3);
    }
}
