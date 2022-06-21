import java.util.Scanner;

public class CalculatorfromFahrenheittoCelsius {

	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
        System.out.print("È­¾¾¿Âµµ : ");
        float fahrenheit = calculator.nextInt();
        
        double celcius = (double)5 / 9 * (fahrenheit-32);
        System.out.printf("È­¾¾¿Âµµ¸¦ ¼·¾¾¿Âµµ·Î º¯È¯ÇÑ °ª : %.2f ", celcius);
        calculator.close();
	}

}
