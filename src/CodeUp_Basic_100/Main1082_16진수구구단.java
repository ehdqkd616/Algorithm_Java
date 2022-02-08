package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1082_16진수구구단 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int iNum = sc.nextInt(16);
		int i;
		for(i=1;i<16;i++) {
			System.out.printf("%X*%X=%X\n", iNum, i, iNum*i);
		}
		
	}
}
