//	1011 : [기초-입출력] 문자 1개 입력받아 그대로 출력하기(설명)
//
//	문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
//	변수에 저장되어 있는 문자를 그대로 출력해보자.
//	
//	참고
//	char x;
//	scanf("%c", &x);
//	printf("%c", x);
//	
//	와 같은 방법으로 가능하다.
//	
//	
//	입력
//	문자 1개가 입력된다.
//	(단, 입력되는 문자는 알파벳 대, 소문자 및 숫자를 비롯한 아스키코드로 표현할 수 있는 문자들만 입력된다.)
//	
//	
//	출력
//	입력된 문자를 그대로 출력한다.
//	
//	
//	입력 예시   
//	p
//	
//	출력 예시
//	p

package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1011 {

	public static void main(String[] args) {
		
        char x;
        Scanner sc = new Scanner(System.in);
        x = sc.next().charAt(0);
        System.out.println(x);
        
	}

}
