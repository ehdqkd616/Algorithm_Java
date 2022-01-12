package BaekJoon._32_Acc_Sum_Recursive;

/*
 * ���� �Ұ�
 * - �Էµ� �� �������� ���� ���Ͻÿ�
 * - 1 4
 * - ����: 10
 * 
 * Tag >>> ���, Recursive function
 */

import java.util.Scanner;

public class Main {
	
	// 1 3 = > 1 + 2 + 3 = 6
	
	
	// Ż������
	public static int calAccSum(int start, int end) {
		
		if (start == end) {
			return start;
		}
		
		return start + calAccSum(start+1, end);
	}
	
	 
	//  1, 3   => return 1 + calAccSum(2, 3);
	//								2  + calAccSum(3, 3);
	//                                         3
	// 6

	public static void main(String[] args) {

		int start;
		int end;
		Scanner scan = new Scanner(System.in);
		
		start = scan.nextInt();
		end = scan.nextInt();
		
		int ans = 0;
		
		ans = calAccSum(start, end);
		
		System.out.println("acc sum ="+ans);
	}
	
	
	
}
