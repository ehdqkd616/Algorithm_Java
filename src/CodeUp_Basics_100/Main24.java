package CodeUp_Basics_100;
import java.util.Scanner;
 
public class Main24 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        
        System.out.printf("%d\n", firstNum+secondNum);
        System.out.printf("%d\n", firstNum-secondNum);
        System.out.printf("%d\n", firstNum*secondNum);
        System.out.printf("%d\n", firstNum/secondNum);
        System.out.printf("%d\n", firstNum%secondNum);
        System.out.printf("%.2f\n", (float)firstNum/secondNum);
    }
}
