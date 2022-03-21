import java.util.Scanner;

public class FutsalMenu {

	public static void main(String[] args) {
		int num = 0;
		Scanner  input = new Scanner(System.in);
		
		while (num != 6) {
		System.out.println("*** FutSal Management System Menu ***");
		System.out.println("1. Add Member");
		System.out.println("2. Delete Member");
		System.out.println("3. Edit Member");
		System.out.println("4. View Member");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1 - 6 :");
		num = input.nextInt();
		switch(num) {
		case 1 : 
			System.out.print("Member Student ID : ");
			int ID = input.nextInt();
			System.out.print("Member name: ");
			String MemberName = input.nextLine();
			System.out.print("Member's Phone number : ");
			String Phonenum = input.nextLine();
			break;
		case 2 : 
			System.out.print("Member Student ID : ");
			int team = input.nextInt();
			break;
		case 3 :
			System.out.print("Member Student ID : ");
			int ID2 = input.nextInt();
			break;
		case 4 : 
			System.out.print("Member Student ID : ");
			int ID3 = input.nextInt();
			break;
		case 5 :
		case 6 :
			System.out.print("*** System Exit ***");
		}

			
		}
		

		}
		
	}

