package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1080_언제까지더해야할까 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int iNum = sc.nextInt();
		int sum = 0;
		int i = 0;
		
		while(sum < iNum) {
			sum += i;
			i++;
		}
		i--;
		System.out.println(i);
		
	}
}
