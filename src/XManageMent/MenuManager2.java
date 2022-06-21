package XManageMent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.FutsalManager;
import gui.WindowFrame;
import log.EventLogger;

public class MenuManager2 {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FutsalManager futsalManager = getObject("futsalmanager.ser");
		if (futsalManager == null) {
			futsalManager = new FutsalManager(input);
		}
		else {
			futsalManager.setScanner(input);
		}
		WindowFrame frame = new WindowFrame(futsalManager);
		selectMenu(input, futsalManager);
		putObject(futsalManager, "futsalmanager.ser");
	}
	
	public static void selectMenu(Scanner input, FutsalManager FutsalManager) {
		int num = -1;
		while (num != 5) {
			try {
				

			showMenu();

		num = input.nextInt();
		switch(num) {
		case 1 :
			FutsalManager.addMember();
			logger.log("add a member");
			break;
		case 2 :
			FutsalManager.deleteMember();
			logger.log("delete a member");
			break;
		case 3 :
			FutsalManager.editMember();
			logger.log("edit a member");
			break;
		case 4 :
			FutsalManager.viewMembers();
			logger.log("edit a list of member");
			break;
			default:
				continue;
			}
		}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	
	public static void showMenu() {
		System.out.println("*** FutSal Management System Menu ***");
		System.out.println("1. Add Member");
		System.out.println("2. Delete Member");
		System.out.println("3. Edit Member");
		System.out.println("4. View Members");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 6 :");
	}
	
	public static FutsalManager getObject(String filename) {
		FutsalManager futsalManager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
		futsalManager = (FutsalManager) in.readObject();
		
		in.close();
		file.close();
		
		} catch (FileNotFoundException e) {
			return futsalManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return futsalManager;
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