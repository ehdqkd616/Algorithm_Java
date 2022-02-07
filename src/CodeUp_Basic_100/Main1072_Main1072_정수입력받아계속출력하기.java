package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1072_정수입력받아계속출력하기 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int iNum = sc.nextInt();
		int arrNum[] = new int[iNum];
		
		for(int i=0;i<iNum;i++) {
			arrNum[i] = sc.nextInt();
			System.out.println(arrNum[i]);
		}
	}
}
