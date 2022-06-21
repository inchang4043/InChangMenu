package XManageMent;
import java.util.Scanner;

import gui.FutsalManager;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FutsalManager FutsalManager = new FutsalManager(input);
		
		int num = -1;
		while (num != 5) {
		System.out.println("*** FutSal Management System Menu ***");
		System.out.println("1. Add Member");
		System.out.println("2. Delete Member");
		System.out.println("3. Edit Member");
		System.out.println("4. View Members");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 6 :");
		num = input.nextInt();
		if (num == 1) {
			FutsalManager.addMember();
			}
		else if (num == 2) {
			FutsalManager.deleteMember();
			}
		else if (num == 3) {
			FutsalManager.editMember();
			}
		else if (num == 4) {
			FutsalManager.viewMembers();
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

	