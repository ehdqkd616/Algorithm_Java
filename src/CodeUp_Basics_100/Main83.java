package CodeUp_Basics_100;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main83 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
		int a = Integer.parseInt(br.readLine());
		
		System.out.printf("%o %X", a, a);
		
		br.close();
	}

}
