package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1071_0입력될때까지무한출력하기1 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			int iNum = sc.nextInt();
			
			if(iNum==0) {
				break;
			}
			System.out.println(iNum);
		}
		
	}
}
