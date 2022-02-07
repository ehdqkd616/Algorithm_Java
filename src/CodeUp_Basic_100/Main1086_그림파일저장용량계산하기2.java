package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1086_그림파일저장용량계산하기2 { 

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String hbcs[] = br.readLine().split(" ");
		int r = Integer.parseInt(hbcs[0]);
		int g = Integer.parseInt(hbcs[1]);
		int b = Integer.parseInt(hbcs[2]);
		double sum = (double)r*g*b;
		double sumMB = sum/8/1024/1024;
		
		System.out.printf("%.2f MB", sumMB);
		
		br.close();
	}
}
