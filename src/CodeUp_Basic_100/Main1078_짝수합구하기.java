package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1078_짝수합구하기 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int iNum = sc.nextInt();
		int sum = 0;
		int i = 0;
		
		while(i<=iNum) {
			if(i%2==0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println(sum);
		
	}
}
