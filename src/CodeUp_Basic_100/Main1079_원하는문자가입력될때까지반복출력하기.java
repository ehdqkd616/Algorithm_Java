package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1079_원하는문자가입력될때까지반복출력하기 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			char c = sc.next().charAt(0);
			
			if(c == 'q') {
				System.out.println(c);
				break;
			}
			System.out.println(c);
		}
		
	}
}
