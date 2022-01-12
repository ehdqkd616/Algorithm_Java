//	1015 : [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기(설명)

//	실수(float) 1개를 입력받아 저장한 후,
//	저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여
//	소수점 이하 둘 째 자리까지 출력하시오.
//	
//	참고
//	%.3f 와 같은 형식으로 지정하면,
//	소수점 이하 넷 째 자리에서 반올림하여 소수점 이하 셋 째 자리까지 출력하라는 의미이다.
//	
//	
//	입력
//	실수 1개가 입력된다.
//	
//	
//	출력
//	결과를 소수점 셋 째 자리에서 반올림 해, 소숫점 이하 둘째 자리까지 출력한다.
//	(%.2f를 이용하면 된다.)
//	
//	
//	입력 예시   
//	1.59254
//	
//	출력 예시
//	1.59

package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1015 {
	
	public static void main(String[] args) {
		
        float f;
        Scanner sc = new Scanner(System.in);
        f = sc.nextFloat();
        
        System.out.printf("%.2f", f);
        
	}

}
