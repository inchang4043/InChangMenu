import java.util.Scanner;

public class CalculatorfromFahrenheittoCelsius {

	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
        System.out.print("ȭ���µ� : ");
        float fahrenheit = calculator.nextInt();
        
        double celcius = (double)5 / 9 * (fahrenheit-32);
        System.out.printf("ȭ���µ��� �����µ��� ��ȯ�� �� : %.2f ", celcius);
        calculator.close();
	}

}
