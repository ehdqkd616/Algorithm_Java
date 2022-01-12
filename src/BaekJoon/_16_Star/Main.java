package BaekJoon._16_Star;

/*
 * ���� �Ұ�
 * - ���� �Է� n�� �޾� �Ʒ��� ���� *�� ����Ͻÿ�
 * - �Է�: 5
 * 
 * ����:
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * Tag >>> �ݺ���(while, for)
 */

public class Main {
	
	public static void main(String[] args) {
		int n = 3;
		
		for (int i = 0; i < n ; i++) {
			for (int j = 0 ; j < i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
