package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1076_문자1개입력받아알파벳출력하기 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		char ascii = sc.next().charAt(0);
		char a = 'a';
		
		while(a<=ascii) {
			System.out.println(a);
			a++;
		}
	}
}
