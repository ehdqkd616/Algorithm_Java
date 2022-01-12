package CodeUp_Basics_100;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main99 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int x = 0;
		String result = null;
		
		if(b%a==0) {
			x = b/a;
			result = String.valueOf(a)+"*"+String.valueOf(x)+"="+String.valueOf(b);
		}else {
			result = "none";
		}
		
		bw.write(result);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
