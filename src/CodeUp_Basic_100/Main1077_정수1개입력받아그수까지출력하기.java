package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1077_정수1개입력받아그수까지출력하기 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int iNum = sc.nextInt();
		int i = 0;
		
		while(i<=iNum) {
			System.out.println(i);
			i++;
		}
	}
}
