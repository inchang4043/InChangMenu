import java.util.Scanner;

public class FutsalMenu2 {

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
		if (num == 1) {
			addMember();
			}
		else if (num == 2) {
			deleteMember();
			}
		else if (num == 3) {
			editMember();
			}
		else if (num == 4) {
			viewMember();
			}
		else {
			continue;
		}
		}
	}
	public static void addMember() {
		Scanner  input = new Scanner(System.in);
		System.out.print("Member ID:");
		int memberId = input.nextInt();
		System.out.print("Member Name:");
		String memberName = input.next();
		System.out.print("Member Email address:");
		String memberEmail = input.next();
		System.out.println(memberEmail);
		System.out.print("Member Phone number:");
		String memberphonenumber = input.next();
		
	}
	public static void deleteMember() {
		Scanner  input = new Scanner(System.in);
		System.out.print("Member ID:");
		int memberId = input.nextInt();
	}
	public static void editMember() {
		Scanner  input = new Scanner(System.in);
		System.out.print("Member ID:");
		int memberId = input.nextInt();
	}
	public static void viewMember() {
		Scanner  input = new Scanner(System.in);
		System.out.print("Member ID:");
		int memberId = input.nextInt();
	}
}

	