//	1017 : [기초-입출력] 정수 1개 입력받아 3번 출력하기(설명)
//	
//	int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
//	
//	참고
//	printf("%d %d %d", a, a, a);
//	와 같은 방법으로 출력할 수 있다.
//	
//	
//	입력
//	정수 1개가 입력된다.
//	
//	
//	출력
//	입력받은 정수를 공백으로 구분해 3번 출력한다.
//	
//	
//	입력 예시   
//	125
//	
//	출력 예시
//	125 125 125

package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1017 {

	public static void main(String[] args) {
		
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        System.out.printf("%d %d %d", a,a,a);
        
	}
	
}
