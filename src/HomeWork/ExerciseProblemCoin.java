package HomeWork;
import java.util.Scanner;

public class ExerciseProblemCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int coin = 0;
		int sw = 0;
		
		while(true) {
			System.out.println(" ***���� �� �� ���߱�*** ");
			System.out.print("���� �Է�(1.�ո�, 2.�޸�):");
			input = Integer.parseInt(sc.nextLine());
			coin = (int)(Math.random()*(2 - 1 + 1) + 1);
			
			System.out.println("-");
			if(input==1) {
				System.out.println("���� �ո� ����");
			} else {
				System.out.println("���� �޸� ����");
			}
			
			if(coin==1) {
				System.out.println("***���� �ո�***");
			} else {
				System.out.println("***���� �޸�***");
			}
			
			if(input==coin)
			{
				System.out.println("***����***");
			} else {
				System.out.println("***����***");
			}
			System.out.println("-");
			System.out.print("�������1.Y, 2.N:");
			sw=Integer.parseInt(sc.nextLine());
			if(sw==2) {
				System.out.println("����");
				break;
			}
		}

	}

}
