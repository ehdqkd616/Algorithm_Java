package CodeUp_Basics_100;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main92 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[3];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		String result;
		
		if(c < 10) {
			result = arr[0]+arr[1]+"0"+arr[2];
		}else {
			result = arr[0]+arr[1]+arr[2];
		}
		
		bw.write(result);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
