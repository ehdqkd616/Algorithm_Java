package Algorithm_Basics._12_NumRec3;

/*
 * ���� �Ұ�
 * - �Էµ� ��(N) ��ŭ N�� N���� ���·� �Ʒ��� ���� ��µǴ�
 * ���� �簢���� ����Ͻÿ�
 * - 4
 * - ����:  1   5   9   13
 * 		   2   6  10   14
 * 		   3   7  11   15
 * 		   4   8  12   16
 * 
 * Tag >>> ��ø �ݺ��� (for Ȥ�� while), �迭
 */

public class Main {
	
	public static void main(String[] args) {

		int n = 4;
		int arr[][] = new int[n][n];
		
		/* n = 3
		 * 
		 *  1 4 7
		 *  2 5 8 
		 *  3 6 9
		 *  
		 */
		int num = 1;
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				arr[j][i] = num;
				num++;
				//arr[j][i] = i*n + j+1;
			}
		}

		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
}
