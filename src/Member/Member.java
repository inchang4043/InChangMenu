package Member;

import java.io.Serializable;
import java.util.Scanner;

import Exception.EmailFormatException;

public abstract class Member implements MemberInput, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4994997620245240357L;
	
	protected MemberKind kind = MemberKind.University;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	
	public Member() {
	}
	
	public Member(MemberKind kind) {
		this.kind = kind;
	}
	
	public Member(String name, int id) {
		this.name = name;
		this.id = id;	
	}
	
	public Member(String name, int id, String email, String phone) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone; 
		
	}
	
	public Member(MemberKind kind, String name, int id, String email, String phone) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone; 
		
	}
	
	public MemberKind getKind() {
		return kind;
	}

	public void setKind(MemberKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException{
		if (!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public abstract void printInfo();
	
	public void setMemberID(Scanner input) {
		System.out.print("Member ID:");
		int id = input.nextInt();
		this.setId(id);
	}
	
	public void setMemberName(Scanner input) {
		System.out.print("Member Name:");
		String name = input.next();
		this.setName(name);
	}
	public void setMemberEmail(Scanner input) {
		String email = "";
		while(!email.contains("@")) {
		System.out.print("Member Email address:");
		email = input.next();
		try {
			this.setEmail(email);
		} catch (EmailFormatException e) {
			System.out.println("Incorrect Email Format. put the e-mail address that contains @");
		}
		}
	}
	
	public void setMemberPhone(Scanner input) {
		System.out.print("Member Phone number:");
		String phone = input.next();
		this.setPhone(phone);
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case University:
			skind = "Univ.";
			break;
		case HighSchool:
			skind = "High.";
			break;
		case MiddleSchool:
			skind = "Middle.";
			break;
		case ElementarySchool:
			skind = "Elementary.";
			break;
		default: 	
		}
		return skind;
	}
}
