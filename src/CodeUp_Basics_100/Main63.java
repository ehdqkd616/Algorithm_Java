package CodeUp_Basics_100;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main63 {

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter
		
		// �켱 �츮�� �Ϲ������� �ڹٿ��� �Է��� �������� java.util ��Ű���� �ִ� Scanner Ŭ������ import�ؿ´�. 
		// �̷��� �ܼ��� import�� �ϰ� Scanner sc = new Scanner(System.in); ó�� ���ִ°� �����ε� ������ ��ĳ�ʸ� ����� �� �ִ�.
		// �׷��� ��ĳ���� ��� ����ϱ� �������� �ӵ��� �����ٴ� ġ������ ������ �ִ�.
		// �ӵ��� ���� Scanner���� BufferedReader�� �̿��ϴ°� �ξ� ������.
		
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