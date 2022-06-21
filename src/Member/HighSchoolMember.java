package Member;

import java.util.Scanner;

public class HighSchoolMember extends TeenageMember {
	
	
	public HighSchoolMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner  input) {
		setMemberID(input);
		setMemberName(input);
		setMemberEmailwithYN(input);
		setMemberPhone(input);
	}
	
	public void setMemberEmailwithYN(Scanner input) {
		
	}
	
}

