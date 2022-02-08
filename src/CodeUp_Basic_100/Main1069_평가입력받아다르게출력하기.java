package CodeUp_Basic_100;

import java.util.Scanner;

public class Main1069_평가입력받아다르게출력하기 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		char score = sc.next().charAt(0);

		switch (score) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
		}
		
	}
}
