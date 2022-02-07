package CodeUp_Basic_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1084_빛섞어색만들기 { 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		String rgb[] = br.readLine().split(" ");
		int r = Integer.parseInt(rgb[0]);
		int g = Integer.parseInt(rgb[1]);
		int b = Integer.parseInt(rgb[2]);
		int i, j, k;
		int count = r*g*b;
		
		for(i=0; i<r; i++) {
			for(j=0; j<g; j++) {
				for(k=0; k<b; k++){				
					bw.write(i+" "+j+" "+k+"\n");
				}
			}
		}
		bw.write(String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
