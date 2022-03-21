import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SecondConverter {

	public static void main(String[] args) {
		
		int days, hours, min, sec;
		
		Scanner input = new Scanner(System.in);
		System.out.println("seconds ют╥б : ");
		sec = input.nextInt();
		
		sec = 100000;
		min = sec /60;
		hours = min /60;
		days = hours /24;

		System.out.println("d: " + days);
		System.out.println("h: " + hours);
		System.out.println("m: " + min);
		System.out.println("s: " + sec);
	}

}
