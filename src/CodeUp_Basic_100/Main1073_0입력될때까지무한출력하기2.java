package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1073_0입력될때까지무한출력하기2 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			int iNum = sc.nextInt();
			
			if(iNum==0) {
				break;
			}
			System.out.println(iNum);
		}
		
	}
}
