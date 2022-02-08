package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1075_정수1개입력받아카운트다운출력하기2 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int iNum = sc.nextInt()-1;
		
		while(iNum >= 0) {
			System.out.println(iNum);
			iNum--;
		}
	}
}
