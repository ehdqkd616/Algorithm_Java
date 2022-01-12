//	1021 : [기초-입출력] 단어 1개 입력받아 그대로 출력하기(설명)
//	
//	1개의 단어를 입력받아 그대로 출력해보자.
//	
//	
//	입력
//	한 단어가 입력된다.(단, 단어의 길이는 50자 이하이다.)
//	
//	문자를 50개 저장하기 위해서는 char data[51] 로 선언하면 된다.
//	
//	char data[51]="";
//	scanf("%s", data);
//	
//	를 실행하면, data[51] 에 한 단어가 저장된다.
//	
//	
//	출력
//	입력된 단어를 그대로 출력한다.
//	
//	
//	
//	
//	입력 예시   
//	Informatics
//	
//	출력 예시
//	Informatics

package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1021 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        if(str.length() >= 50) {
        	str = str.substring(0, 50);
        }
        
        System.out.println(str);
        
    }

}
