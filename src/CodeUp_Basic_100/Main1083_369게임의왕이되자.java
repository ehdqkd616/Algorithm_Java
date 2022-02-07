package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1083_369게임의왕이되자 { 

	public static int getNum (int i) {
		int j = 0;
		
		while (i > 0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				j++;
			}
			i /= 10;
		}
		return j;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		try {
			int iNum = sc.nextInt();
			
			for (int i = 1; i <= iNum; i++) {
				int cnt = getNum(i);
				
				if (cnt == 0) {
					System.out.print(i+ " ");
				}
				else {
					for (int l = 0; l < cnt; l++) {
					 System.out.print("X");
					}
					System.out.print(" ");
				}
			}
		}catch (InputMismatchException e) {
			System.out.println("정수만 입력 가능");
		}

	}
}
