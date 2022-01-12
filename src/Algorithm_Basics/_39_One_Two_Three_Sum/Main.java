package Algorithm_Basics._39_One_Two_Three_Sum;
import java.util.Scanner;

/*
 * ���� �Ұ�
 * ���� 4�� 1, 2, 3�� ������ ��Ÿ���� ����� �� 7������ �ִ�. ���� ��Ÿ�� ���� ���� 1�� �̻� ����ؾ� �Ѵ�.
 * 1+1+1+1
 * 1+1+2
 * 1+2+1
 * 2+1+1
 * 2+2
 * 1+3
 * 3+1
 * ���� n�� �־����� ��, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ���� �Է�:
 * 4
 * 7
 * 10
 * ���
 * 7
 * 44
 * 274
 */

public class Main {
	/*						[1] == 1����
	 *  1 = 1
	 *  					[2] == 2����
	 *  					[2] += [1]
	 *  					[2] += 1		
	 *  1 + 1 = 2
	 *  2 = 2
	 *  					[3] == 4����
	 *  					[3] += [2]
	 *  1 + 1 + 1 = 3
	 *  2 + 1 = 3
	 *  					[3] += [1]
	 *  1 + 2 = 3
	 *  					[3] += 1
	 *  3 = 3
	 *  
	 *  [n] = [n-1] + [n-2] + [n-3]
	 *  					  [4] == 7����
	 *  '1 + 1 + 1' + 1 = 4   [4] += [3]
	 *  '2 + 1' + 1 = 4
	 *  '1 + 2' + 1 = 4
	 *  '3' + 1 = 4
	 *                        [4] += [2]                
	 *   '1 + 1' + 2 = 4
	 *   '2' + 2 = 4 
	 *  					  [4] += [1]				  
	 *   '1' + 3 = 4
	 */
	
	static int cache[] = new int[1000];
	
	public static int doFunc(int n) {
		if (cache[n] != 0) {
			return cache[n];
		}
		
		return cache[n] = doFunc(n-1) + doFunc(n-2) + doFunc(n-3);
	}
	
	public static void main(String[] args) {
		int n;
		cache[1] = 1;
		cache[2] = 2;
		cache[3] = 4;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(doFunc(n));
	}
}