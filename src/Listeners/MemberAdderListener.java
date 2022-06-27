package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exception.EmailFormatException;
import Member.Member;
import Member.MemberInput;
import Member.MemberKind;
import Member.UniversityMember;
import gui.FutsalManager;

public class MemberAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldEmail;
	JTextField fieldPhone;
	
	FutsalManager futsalManager;

	
	public MemberAdderListener(
			JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldEmail, 
			JTextField fieldPhone, 	FutsalManager futsalManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldEmail = fieldEmail;
		this.fieldPhone = fieldPhone;
		this.futsalManager = futsalManager;

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		MemberInput member = new UniversityMember(MemberKind.University);

		try {
			member.setId(Integer.parseInt(fieldID.getText()));
			member.setName(fieldName.getName());
			member.setEmail(fieldEmail.getText());
			member.setPhone(fieldPhone.getText());
			futsalManager.addMember(member);
			putObject(futsalManager, "futsalmanager.ser");
			member.printInfo();
		} catch (EmailFormatException e1) {
			e1.printStackTrace();
		}
		
	}
	public static void putObject(FutsalManager futsalManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
		out.writeObject(futsalManager);
		
		out.close();
		file.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
