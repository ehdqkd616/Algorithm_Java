package BaekJoon._20_369;

/*
 * ���� �Ұ�
 * - 100���� 369 ������ �Ʒ��� ���� �����Ͻÿ�.
 * ����: 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ 14 15 ¦ 17 18 ¦ 20 21 22 ¦ 24 25 ¦ 27
 * 28 ¦ ¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ 40 41 42 ¦ 44 45 ¦ 47 48 ¦ 50 51 52
 * ¦ 54 55 ¦ 57 58 ¦ ¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ 70 71 72 ¦ 74 75 ¦ 77
 * 78 ¦ 80 81 82 ¦ 84 85 ¦ 87 88 ¦ ¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ 100
 * 
 * Tag >>> �ݺ���(while, for), if, Method
 */

public class Main {
	
	public static int getNum (int i) {
		int j = 0;
		
		while (i > 0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
				j++;
			i /= 10;
		}
	
		
		return j;
	}
	public static void main(String[] args) {
		int n = 100;
		
		for (int i = 1; i <= n; i++) {
			int cnt = getNum(i);
			
			if (cnt == 0) {
				System.out.print(i+ " ");
			}
			else {
				for (int l = 0; l < cnt; l++) {
				 System.out.print("¦");
				}
				System.out.print(" ");
			}
		}
		
		
	}
}
