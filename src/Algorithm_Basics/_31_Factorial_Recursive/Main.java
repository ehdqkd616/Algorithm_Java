package Algorithm_Basics._31_Factorial_Recursive;

/*
 * ���� �Ұ�
 * - �Էµ� ���� ���丮���� ���Ͻÿ�
 * - 5
 * - ����: 120
 * 
 * Tag >>> ���, Recursive function
 */

import java.util.Scanner;

public class Main {
	
    //Ż������
	
	public static int calFact(int i) {
		
		if (i == 1 ) {
			return 1;
		}
		
		return i * calFact(i-1);
	}
	// 3 * 2 * 1
	// 		2 * 1
	//			 * 1
	// -> 6
	
	
	public static void main(String[] args) {

		int input;
		Scanner scan = new Scanner(System.in);
		
		input = scan.nextInt();
		int ans = 0;
		
		
		ans = calFact(input);
		
		
		
		System.out.println(ans);
	
	}
	
	
	
}
