package CodeUp_Basics_100;
import java.util.Scanner;
 
public class Main17 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ascii = (char) num;
        
        System.out.printf("%c", ascii);
    }
}
