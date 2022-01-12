//	1020 : [기초-입출력] 주민번호 입력받아 형태 바꿔 출력하기
//	
//	주민번호는 다음과 같이 구성된다.
//	
//	XXXXXX-XXXXXXX
//	
//	앞의 6자리는 생년월일(yymmdd)이고 뒤 7자리는 성별, 지역, 오류검출코드이다.
//	주민번호를 입력받아 형태를 바꿔 출력해보자.
//	
//	
//	입력
//	주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력된다.
//	(입력값은 가상의 주민번호이다.)
//	ex)110011-0000000
//	
//	
//	출력
//	'-'를 제외한 주민번호 13자리를 모두 붙여 출력한다.
//	
//	입력 예시   
//	000907-1121112
//	
//	출력 예시
//	0009071121112

package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1020 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("\\-");
        
        System.out.printf("%s%s", arr[0], arr[1]);
        
    }

}
