import java.util.Scanner;

public class IfChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        
        if ((x %2) ==0) {
        	System.out.println("even number");
        }
        else {
        	System.out.println("odd number");
        }
        System.out.println("End!");
        
	}

}
