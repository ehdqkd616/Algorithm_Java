package BaekJoon._15_Gugudan;

/*
 * ���� �Ұ�
 * - ������ ���� s���� f�ܱ��� �Է� �޾� �Ʒ��� ���� ����Ͻÿ�
 * - �Է�: 2 3
 * ����: 
 * 2 * 1 = 2	3 * 1 = 3
 * 2 * 2 = 4	3 * 2 = 6
 * 2 * 3 = 6	3 * 3 = 9
 * 2 * 4 = 8	3 * 4 = 12
 * 2 * 5 = 10	3 * 5 = 15
 * 2 * 6 = 12	3 * 6 = 18
 * 2 * 7 = 14	3 * 7 = 21
 * 2 * 8 = 16	3 * 8 = 24
 * 2 * 9 = 18	3 * 9 = 27
 */

public class Main {
	
	public static void main(String[] args) {
		int s = 2;
		int f = 5;
		// 2 ~ 5 ���
		
		for (int i = 1; i <= 9; i++) {
			for (int dan = s ; dan <= f ; dan++) {
				System.out.printf("%2d *%2d =%3d", dan, i, dan*i);
			}
			System.out.println();
		}
	}
	
}
