//	1014 : [기초-입출력] 문자 2개 입력받아 순서 바꿔 출력하기(설명)

//	2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
//	
//	참고
//	char x, y;
//	scanf("%c %c", &x, &y);
//	printf("%c %c", y, x); //출력되는 순서를 작성
//	와 같은 방법으로 해결할 수 있다.
//	
//	
//	입력
//	2개의 문자가 공백으로 구분되어 입력된다.
//	
//	
//	출력
//	두 문자의 순서를 바꿔 출력한다.
//	
//	
//	입력 예시   
//	A b
//	
//	출력 예시
//	b A

package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1014 {

	public static void main(String[] args) {
		
        char x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.next().charAt(0);
        y = sc.next().charAt(0);
        
        System.out.println(y + " " +x);
        
	}

}
