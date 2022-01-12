package BaekJoon._34_Fibonacci_Recursive;

/*
 * ���� �Ұ�
 * - �Էµ� ���� �Ǻ���ġ ���� ���Ͻÿ�
 * - 6
 * - ����: 8(1->1->2->3->5->8)
 * 
 * Tag >>> ���, Recursive function
 */

import java.util.Scanner;

public class Main {

	public static int pibo(int N) {
		
		if (N == 1)
			return 1;
		if (N == 2)
			return 1;
		
		System.out.println("pibo(N-1) : " + pibo(N-1) + "," + "pibo(N-2) : " + pibo(N-2));
		
		return pibo(N-1) + pibo(N-2);
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int ans = pibo(N);
		
		System.out.println(ans);
		
	}
	
	
	
}
