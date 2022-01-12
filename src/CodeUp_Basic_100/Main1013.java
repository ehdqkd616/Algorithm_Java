//	1013 : [기초-입출력] 정수 2개 입력받아 그대로 출력하기(설명)
//	
//	정수(int) 2개를 입력받아 그대로 출력해보자.
//	
//	참고
//	
//	int a, b;
//	scanf("%d%d", &a, &b);  //엔터/공백으로 입력 데이터가 구분되어 입력
//	printf("%d %d", a, b);
//	
//	와 같은 방법으로 가능하다.
//	
//	
//	입력
//	2개의 정수가 공백으로 구분되어 입력된다.
//	
//	
//	출력
//	입력된 두 정수를 공백으로 구분하여 출력한다.
//	
//	
//	입력 예시   
//	1 2
//	
//	출력 예시
//	1 2

package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1013 {

	public static void main(String[] args) {
		
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.print(a+" "+b);
        
	}

}
