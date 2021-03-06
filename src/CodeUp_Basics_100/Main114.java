package CodeUp_Basics_100;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main114 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int a = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=1; i<=a; i++) {
			if(i%2==0) {
				result += i;
			}
		}
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
