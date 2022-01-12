package Algorithm_Basics._5_CapToLow;

/*
 * ���� �Ұ�
 * - �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͻÿ�
 * - helloWorlD
 * - ����: HELLOwORLd
 * 
 * Tag >>> �迭, for, if
 */

public class Main {
	public static void main(String[] args) {
		
		String input = "helloWorlD";
		char []arr;
		arr = input.toCharArray();
		System.out.print(arr);
		System.out.println();
		for (int i=0 ; i < arr.length ; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char)(arr[i] + 'A'-'a'); // 'a' 'b' ~ 'z' 'A' 'B' 'C'
			}
			else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - ('A'-'a'));
			}		
		}
		
		System.out.print(arr);
	}
}
