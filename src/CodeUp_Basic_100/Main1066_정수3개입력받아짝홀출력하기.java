package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1066_정수3개입력받아짝홀출력하기 { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		oddEven(a);
		oddEven(b);
		oddEven(c);
	}
	
	public static void oddEven(int num) {
		if (num%2 == 0) {
			System.out.println("even");			
		} else {
			System.out.println("odd");
		}
	}
}
