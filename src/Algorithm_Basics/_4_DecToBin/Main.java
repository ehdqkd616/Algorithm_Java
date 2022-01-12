package Algorithm_Basics._4_DecToBin;

/*
 * ���� �Ұ�
 * - 10������ 2������ ��ȯ�Ͻÿ�
 * - 19
 * - ����: 10011
 * 
 * Tag >>> �迭, �ݺ���(while, for)
 */

public class Main {

	public static void main(String[] args) {

		int inputNum = 25;
		int bin[] = new int[100]; 
		
		/*
		 * 19 / 2    9 ... 1
		 * 9  / 2    4 ... 1
		 * 4  / 2    2 ... 0
		 * 2  / 2    1 ... 0
		 * 1  / 2    0 ... 1
		 *
		 *  010011 =>  19
		 */
		
		int i = 0;
		int mok = inputNum;
		
		while (mok > 0) {
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}
		
		i--;
		for (; i>=0; i--) {
			System.out.print(bin[i]);
		}
		
	}

}
