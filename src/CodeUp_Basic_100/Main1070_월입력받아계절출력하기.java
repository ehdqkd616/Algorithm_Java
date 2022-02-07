package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1070_월입력받아계절출력하기 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int month = sc.nextInt();

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
			break;	
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;	
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;	
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
			break;	
		}
		
	}
}
