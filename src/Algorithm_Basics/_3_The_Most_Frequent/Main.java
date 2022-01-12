package Algorithm_Basics._3_The_Most_Frequent;

import java.util.Scanner;

/*
 * ���� �Ұ�
 * - ���� ���� ������ ���� ����Ͻÿ�.
 * - 1 2 2 3 1 4 2 2 4 3 5 3 2 
 * - ����: 2 (5ȸ)
 * 
 * Tag >>> �迭, for
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int []inputNum = new int[10];
		for (int i=0; i<10 ; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		//����� input

		//1 2 2 3 1 4 2 2 4 3
		
		// 1: 2
		// 2: 4  --> �ֺ��
		// 3: 2
		// 4: 2
		
		int []mode = new int [10];
		
		// index -> ������ ��
		// index �� -> index(�����Ѽ�)�� ������Դ��� �����ϴ� �뵵 
		
		// "mode[3] = 5, => 3�����ڰ�, 5�� �����ߴ�"
		
		
		//inputNum => 1 2 2 3 1 4 2 2 4 3
		for (int i=0; i<10 ; i++) {
			  mode[inputNum[i]]++;  
		}
		 //mode[1] == 2
		 //mode[2] == 4
		 //mode[3] == 2
		 //mode[4] == 2
		
		
		int modeNum = 0; //�ֺ�� 
		int modeCnt = 0; //�ֺ���� ����Ƚ��
		
		for (int i=0; i<10 ; i++) {
			if (modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("�ֺ����:"+modeNum+" cnt:"+modeCnt);
		
	}

}
