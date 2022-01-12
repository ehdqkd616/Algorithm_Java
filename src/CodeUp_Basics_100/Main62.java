package CodeUp_Basics_100;
import java.util.Scanner;

public class Main62 {

	public static void main(String[] args) { // BufferedReader ����ؾ���
		Scanner sc = new Scanner(System.in); 
		int i, j, k, c=0;
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		for(i=0; i<r; i++)
		  for(j=0; j<g; j++)
		    for(k=0; k<b; k++)
		    {
		      System.out.println(i + " " + j + " " + k);
		      c++;
		    }

		System.out.println(c);
	}
}