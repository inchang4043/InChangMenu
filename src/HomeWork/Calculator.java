package HomeWork;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

        Scanner Calculator = new Scanner(System.in);
 
        int a = 0;
        int b = 0;
        String c = "";
 
        while (true) {
            System.out.print("ó�� ���� �Է�: ");
            a = Calculator.nextInt();
 
            if (a == 999) {
                System.out.print("*** ���� ***.");
                return;
            } else {
 
                System.out.print("���� ���� �Է�: ");
                b = Calculator.nextInt();
 
                System.out.print("��Ģ���� �Է�(+ - * /):");
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
                    System.out.println("�峭�ϳ�!");
                }
            }
        }
    }
}
