package gui;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Listener.PlayerAdderCancelListener;
import PlayerManagement.PlayerInput;
import PlayerManagement.PlayerManager;

public class PlayerViewer extends JPanel{
	
	WindowFrame frame;
	PlayerManager playerManager;
	
	public PlayerManager getPlayerManager() {
		return playerManager;
	}

	public void setPlayerManager(PlayerManager playerManager) {
		this.playerManager = playerManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Team");
		model.addColumn("Salary");
		
		for(int i = 0; i<playerManager.size();i++) {
			Vector row = new Vector();
			PlayerInput pi = playerManager.get(i);
			row.add(pi.getNumber());
			row.add(pi.getName());
			row.add(pi.getTeam());
			row.add(pi.getSal());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new PlayerAdderCancelListener(frame));
		
		this.add(sp);
		this.add(cancelButton);
	}

	public PlayerViewer(WindowFrame frame, PlayerManager playerManager) {
		
		this.frame = frame;
		this.playerManager = playerManager;
		
		System.out.println("***" + playerManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Team");
		model.addColumn("Salary");
		
		for(int i = 0; i<playerManager.size();i++) {
			Vector row = new Vector();
			PlayerInput pi = playerManager.get(i);
			row.add(pi.getNumber());
			row.add(pi.getName());
			row.add(pi.getTeam());
			row.add(pi.getSal());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}		
}
