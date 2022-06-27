package HomeWork;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

        Scanner Calculator = new Scanner(System.in);
 
        int a = 0;
        int b = 0;
        String c = "";
 
        while (true) {
            System.out.print("처음 숫자 입력: ");
            a = Calculator.nextInt();
 
            if (a == 999) {
                System.out.print("*** 종료 ***.");
                return;
            } else {
 
                System.out.print("다음 숫자 입력: ");
                b = Calculator.nextInt();
 
                System.out.print("사칙연산 입력(+ - * /):");
                c = Calculator.next();
 
                switch (c) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("장난하나!");
                }
            }
        }
    }
}
