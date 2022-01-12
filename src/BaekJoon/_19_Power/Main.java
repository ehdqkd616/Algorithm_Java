package BaekJoon._19_Power;

/*
 * ���� �Ұ�
 * - ���� �Է� n�� m���� ����� ����Ͻÿ�
 * - �Է�: 5 3
 * 
 * ����: 125
 * 
 * Tag >>> �ݺ��� (while, for)
 */

public class Main {
	public static void main(String[] args) {
		int n = 5;
		int m = 3;
		int j = 1;
		
		for (int i = 0 ; i < m ; i++) {
			j *= n;
		}
		System.out.println(j);
	}
}
