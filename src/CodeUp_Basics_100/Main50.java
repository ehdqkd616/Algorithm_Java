package CodeUp_Basics_100;
import java.util.Scanner;

public class Main50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			int iNum = sc.nextInt();
			
			if(iNum==0) {
				break;
			}
			System.out.println(iNum);
		}
		
	}
}