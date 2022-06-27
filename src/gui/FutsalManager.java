package gui;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Member.ElementarySchoolMember;
import Member.HighSchoolMember;
import Member.Member;
import Member.MemberInput;
import Member.MemberKind;
import Member.UniversityMember;

public class FutsalManager implements Serializable {
	    /**
	 * 
	 */
	private static final long serialVersionUID = -878864742179743308L;
	
		ArrayList<MemberInput> members = new ArrayList<MemberInput>();
		transient Scanner  input;
		public FutsalManager(Scanner input) {
			this.input = input;
		}
		
		public void setScanner(Scanner input) {
			this.input = input;
		}
		
		public void addMember(String id, String name, String email, String phone) {
			MemberInput memberInput = new UniversityMember(MemberKind.University);
			MemberInput.getUserInput(input);
			members.add(memberInput);
		}
		
		public void addMember(MemberInput memberInput) {
			members.add(memberInput);
		}
	public void addMember() {
		int kind = 0;
		MemberInput memberInput;
		while (kind < 1 || kind > 3) {
			try {
		System.out.println("1 for University:");
		System.out.println("2 for High School:");
		System.out.println("3 for Elementary School:");
		System.out.print("Select num 1, 2, or 3 for Member Kind :");
		kind = input.nextInt();
		if (kind == 1) {
			memberInput  = new UniversityMember(MemberKind.University); 
			MemberInput.getUserInput(input); 
			members.add(memberInput);
			break;
		}
		else if (kind == 2) {
			memberInput  = new HighSchoolMember(MemberKind.HighSchool);
			MemberInput.getUserInput(input);
			members.add(memberInput);
			break;
		}
		else if (kind == 3) {
			memberInput  = new ElementarySchoolMember(MemberKind.ElementarySchool);
			MemberInput.getUserInput(input);
			members.add(memberInput);
			break;
		}
		else {
			System.out.print("Select num for Member Kind between 1 and 2:");
		}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
	 }		
  }
	
	public void deleteMember() {
		System.out.print("Member ID:");
		int memberId = input.nextInt();
		int index = findIndex(memberId);
		removefromMember(index, memberId);
	}
	
	public int findIndex(int memberId) {
		int index = -1;
		for (int i = 0; i<members.size(); i++) {
			if (members.get(i).getId() == memberId) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromMember(int index, int memberId) {
		if (index >= 0) {
			members.remove(index);
			System.out.println("the member " + memberId + "is deleted");
			return 1;
		}
		else {
			System.out.println("the member has not been registered");
			return -1;
		}	
	}
	
	public void editMember() {
		System.out.print("Member ID:");
		int memberId = input.nextInt();
		for (int i = 0; i<members.size(); i++) {
			MemberInput member = members.get(i);
			if (member.getId() == memberId) {
			  int num = -1;
			  while (num != 5) { 
				  showEditMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					member.setMemberID(input);
					break;
				case 2:
					member.setMemberName(input);
					break;
				case 3:
					member.setMemberEmail(input);
					break;
				case 4:
					member.setMemberPhone(input);
					break;
				default:
					continue;
				}
			 } // while
			  break;
		  } // if
	   }  // for
	}
	
	public void viewMembers() {
		System.out.println("# of registered members:" + members.size());
		for (int i = 0; i<members.size(); i++) {
			members.get(i).printInfo();
		}
	}
	public int size() {
		return members.size();
	}
	
	public MemberInput get(int index) {
		return (Member) members.get(index);
	}
//	public MemberInput get(int index) {
//		return (Member) members.get(index);
//	}
//	
	public void showEditMenu() {
		System.out.println("*** FutSal Management System Menu ***");
		System.out.println("1. Edit MemberId");
		System.out.println("2. Edit MemberName");
		System.out.println("3. Edit Email");
		System.out.println("4. View Phone");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 6 :");
	}

	
}

	