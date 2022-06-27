package Listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MemberAdder;
import gui.MemberViewer;
import gui.WindowFrame;

public class MemberAdderCancelListener implements ActionListener {
	
	WindowFrame frame;

	public MemberAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton) e.getSource();
//		MemberAdder adder = frame.getMemberadder();
//		frame.setupPanel(adder);
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
