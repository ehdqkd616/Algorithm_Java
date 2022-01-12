//	1022 : [기초-입출력] 문장 1개 입력받아 그대로 출력하기(설명)
//	
//	공백 문자가 포함되어 있는 문장을 입력받고 그대로 출력하는 연습을 해보자.
//	
//	예시
//	char data[2001];
//	fgets(data, 2000, stdin);
//	printf("%s", data);
//	
//	위와 같이 실행하면 공백이 포함된 문장을 키보드(stdin)로 입력받아
//	최대 2000자까지 data[ ] 공간에 저장하고 출력할 수 있다.
//	
//	%s 는 문자열(string, 실로 연결된 문자들. 문장)로 출력하라는 의미이다.
//	
//	참고
//	fgets( ) 를 사용하면 공백문자가 포함되어잇는 문장을 입력받아 저장할 수 있다.
//	만약, 아래처럼
//	scanf("%s", ... ) 를 이용해 문장을 입력받으면, 첫 번째 단어까지만 저장된다.
//	
//	char data[51] = ""; //최대 50문자까지 저장 가능
//	scanf("%s", data);
//	
//	
//	
//	
//	입력
//	공백이 포함되어 있는 한 문장이 입력된다.
//	단, 입력되는 문장은 여러 개의 단어로 구성되고, 엔터로 끝나며,
//	최대 길이는 2000 문자를 넘지 않는다.
//	출력
//	입력된 문장을 그대로 출력한다.
//	
//	입력 예시   
//	Programming is very fun!!
//	
//	출력 예시
//	Programming is very fun!!

package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1022 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        if(str.length() >= 2000) {
        	str = str.substring(0, 2000);
        }
        
        System.out.println(str);
        
    }

}
