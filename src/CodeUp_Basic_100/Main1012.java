//	1012 : [기초-입출력] 실수 1개 입력받아 그대로 출력하기(설명)
//	
//	실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후
//	저장되어 있는 실수값을 출력해보자.
//	
//	참고
//	float x;
//	scanf("%f", &x);
//	printf("%f", x);
//	와 같은 방법으로 가능하다.
//	
//	
//	입력
//	실수값 1개가 입력된다.
//	(단, float로 저장할 수 있는 실수 값만 입력된다.)
//	
//	
//	출력
//	입력된 실수값을 그대로 출력한다.
//	
//	
//	입력 예시   
//	1.414213
//	
//	출력 예시
//	1.414213

package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1012 {

	public static void main(String[] args) {
		
        Float x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        
        System.out.printf("%6f", x);
        
	}

}
