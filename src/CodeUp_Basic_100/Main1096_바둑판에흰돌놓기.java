package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1096_바둑판에흰돌놓기 { 

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n, x, y;
		int a[][] = new int[20][20];
		n = Integer.parseInt(br.readLine());
		String [] arr = new String[2];
		
		for(int i = 0; i < n; i++) {
			arr = br.readLine().split(" ");
			x = Integer.parseInt(arr[0]);
			y = Integer.parseInt(arr[1]);
			a[x][y] = 1;
		}
				
		for(int i = 1; i < 20; i++) {
			for(int j = 1; j < 20; j++) {
				bw.write(String.valueOf(a[i][j]+" "));
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
