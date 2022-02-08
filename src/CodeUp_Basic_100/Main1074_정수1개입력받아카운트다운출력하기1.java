package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1074_정수1개입력받아카운트다운출력하기1 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int iNum = sc.nextInt();
		
		while(iNum > 0) {
			System.out.println(iNum);
			iNum--;
		}
	}
}
