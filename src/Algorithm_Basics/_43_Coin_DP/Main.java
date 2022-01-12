
package Algorithm_Basics._43_Coin_DP;

/*
 * ���� �Ұ�
 * n���� ������ ������ �ִ�. ������ ������ ��Ÿ���� ��ġ�� �ٸ���. �� ������ ������ ����ؼ�, �� ��ġ�� ���� k����
 * �ǵ��� �ϰ� �ʹ�. �� ����� ���� ���Ͻÿ�. ������ ������ �� ���� ����� �� �ִ�.
 * ����� ������ ������ ������, ������ �ٸ� ���� ���� ����̴�.
 * 
 * �Է�:
 * ù° �ٿ� n, k�� �־�����. (1 <= n <= 100, 1 <= k <= 10,000) ���� n���� �ٿ��� ������ ������
 * ��ġ�� �־�����. ������ ��ġ�� 100,000���� �۰ų� ���� �ڿ����̴�.
 * 
 * ���� �Է�:
 * 3 10
 * 1
 * 2
 * 5
 * ���
 * 10
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 *      1  2  3  4  5  6  7  8  9  10
		 *  1   1  1  1  1  1  1  1  1  1   1
		 *  2   0  1  1  2  2  3  3  4  4   5
		 *  5   0  0  0  0  1  1  2  2  3   4
		 *  	   2  2  3  4  5  5  7  8  10
		 */ 
		
		int coin[] = new int[101];
		int dp[] = new int[10001];
		
		Scanner scan = new Scanner(System.in);
		int numCoin = scan.nextInt();
		int money = scan.nextInt();
		
		for (int i = 1; i <= numCoin ; i++) {
			coin[i] = scan.nextInt();	
		}
		dp[0] = 1;
		for (int i = 1; i <= numCoin ; i++) {
			for (int j = coin[i]; j <= money; j++) {
				dp[j] += dp[j - coin[i]];
			}
		}
		System.out.println(dp[money]);
	}

}