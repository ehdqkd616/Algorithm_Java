package Algorithm_Basics._11_NumRec2;

/*
 * ���� �Ұ�
 * - �Էµ� ��(N) ��ŭ N�� N���� ���·� �Ʒ��� ���� ��µǴ�
 * ���� �簢���� ����Ͻÿ�
 * - 4
 * - ����:  1    2    3    4
 * 		   8    7    6    5
 * 		   9   10   11   12
 * 		  16   15   14   13
 * 
 * Tag >>> ��ø �ݺ��� (for Ȥ�� while), ���ǹ�(if), �迭
 */


public class Main {
	
	public static void main(String[] args) {
		int n = 3;
		
		int arr[][] = new int[n][n];
		
		
		/* n = 3
		 * 
		 * 1 2 3
		 * 6 5 4
		 * 7 8 9
		 */
		
		for (int i = 0; i < n; i++) {
			
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = i * n + j +1;
				}				
			}
			else {
				for (int j = n - 1; j >= 0; j--) {
					arr[i][j] = i * n + n - j;
				}		
			}
		}
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
}
