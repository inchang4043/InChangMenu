package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Member.MemberInput;

public class MemberViewer extends JPanel{

	WindowFrame frame;
	FutsalManager futsalManager;
	
	public MemberViewer(WindowFrame frame, FutsalManager futsalManager) {
		this.frame = frame;
		this.futsalManager = futsalManager;
		
		System.out.println("***" + futsalManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Contact Info.");
		
		for (int i=0; i< futsalManager.size(); i++) {
			Vector row = new Vector();
			MemberInput mi = futsalManager.get(i);
			row.add(mi.getId());
			row.add(mi.getName());
			row.add(mi.getEmail());
			row.add(mi.getPhone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
