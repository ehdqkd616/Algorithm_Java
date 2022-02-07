package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1081_주사위를2개던지면 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=m;j++) {
				System.out.println(i+" "+j);
			}
		}
	}
}
