package BaekJoon._30_plus_and_minus;

/*
 * ���� �Ұ�
 * - �Էµ� ���ڱ��� + = �� ���ʴ�� �ݺ��Ͻÿ�
 * ���� �Է�: 9
 * ��� 1+2-3+4-5+6-7+8-9
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int until;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		until = scan.nextInt();
		
		for (int i = 1; i <= until; i++) {
			if (i == until) {
				System.out.println(i);
				break;
			}			
			
			if (flag) {
				System.out.print(i+"+");
				flag = !flag;
			}
			else {
				System.out.print(i+"-");
				flag = !flag;
			}		
		}
		
		
	
		
	}
}
