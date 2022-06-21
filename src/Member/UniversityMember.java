package Member;

import java.util.Scanner;

public class UniversityMember extends Member {
	
	public UniversityMember(MemberKind kind) {
		super(kind);
	}
	
		public void getUserInput(Scanner input) {
			setMemberID(input);
			setMemberName(input);
			setMemberEmail(input);
			setMemberPhone(input);
		}
		
		public void printInfo() {
			String skind = getKindString();
			System.out.println("kind:" + skind +"name:" + name + "id:" + id + "email" + email + "phone" + phone);
		}
}
