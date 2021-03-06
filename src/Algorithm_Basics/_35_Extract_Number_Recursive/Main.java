package Algorithm_Basics._35_Extract_Number_Recursive;

/*
 * ���� �Ұ�
 * - �Էµ� ���� ���� �ڸ��� ���� ����Ͻÿ�
 * - 2312
 * - ����:
 * 2
 * 3
 * 1
 * 2
 * 
 * Tag >>> ���, Recursive function
 */

import java.util.Scanner;

public class Main {

	public static void extract(int N) {
		
		if (N/10 == 0) {
			System.out.println(N);
			return;
		}

		extract(N/10); // extract(123) extract(12) extract(1)
		System.out.println(N%10);
		//1
		//2
		//3
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		//123 -> 12 -> 1
		//1
		//2
		//3
		extract(input);
	}
	
	
	
}
