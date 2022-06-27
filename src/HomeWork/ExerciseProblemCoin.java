package HomeWork;
import java.util.Scanner;

public class ExerciseProblemCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int coin = 0;
		int sw = 0;
		
		while(true) {
			System.out.println(" ***동전 앞 뒤 맞추기*** ");
			System.out.print("숫자 입력(1.앞면, 2.뒷면):");
			input = Integer.parseInt(sc.nextLine());
			coin = (int)(Math.random()*(2 - 1 + 1) + 1);
			
			System.out.println("-");
			if(input==1) {
				System.out.println("동전 앞면 선택");
			} else {
				System.out.println("동전 뒷면 선택");
			}
			
			if(coin==1) {
				System.out.println("***동전 앞면***");
			} else {
				System.out.println("***동전 뒷면***");
			}
			
			if(input==coin)
			{
				System.out.println("***정답***");
			} else {
				System.out.println("***오답***");
			}
			System.out.println("-");
			System.out.print("계속진행1.Y, 2.N:");
			sw=Integer.parseInt(sc.nextLine());
			if(sw==2) {
				System.out.println("끄읏");
				break;
			}
		}

	}

}
