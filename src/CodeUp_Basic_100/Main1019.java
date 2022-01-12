//	1019 : [기초-입출력] 연월일 입력받아 그대로 출력하기
//	
//	년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
//	
//	입력
//	연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
//	
//	
//	출력
//	입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
//	(%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
//	
//	
//	입력 예시   
//	2013.8.5
//	
//	출력 예시
//	2013.08.05

package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String [] arr = str.split("\\.");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		
		System.out.printf("%04d.%02d.%02d", year, month, day);

	}

}
