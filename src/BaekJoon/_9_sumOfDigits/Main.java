package BaekJoon._9_sumOfDigits;

/*
 * ���� �Ұ�
 * - �Էµ� ���� �� �ڸ��� ���� ���Ͻÿ�
 * - 1242
 * - ����: 9
 * 
 * Tag >>> �ݺ���(for, while)
 */

public class Main {

	public static void main(String[] args) {
		
		int inputNum = 4280;
		int accSum = 0;
		
		// 1232 => 123   =>  12   =>  1       =>  0 
		// 2         3        2       1 => 8
		
		
		while(inputNum > 0) {
			accSum += inputNum % 10;
			inputNum /= 10;
		}
		
		System.out.println(accSum);

		
	}

}
