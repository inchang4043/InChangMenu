package Listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.FutsalManager;
import gui.MemberViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MemberViewer memberViewer = frame.getMemberviewer();
		FutsalManager futsalManager = getObject("futsalmanager.ser");
		memberViewer.setFutsalManager(futsalManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(memberViewer);
		frame.revalidate();
		frame.repaint();
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

}
