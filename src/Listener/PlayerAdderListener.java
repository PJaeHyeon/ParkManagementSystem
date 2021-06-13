package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exception.NumberException;
import PlayerManagement.KLeague;
import PlayerManagement.PlayerInput;
import PlayerManagement.PlayerKind;
import PlayerManagement.PlayerManager;

public class PlayerAdderListener implements ActionListener {
	JTextField fieldNum;
	JTextField fieldName;
	JTextField fieldTeam;
	JTextField fieldSalary;
	
	PlayerManager playerManager;

	public PlayerAdderListener(
			JTextField fieldNum, 
			JTextField fieldName, 
			JTextField fieldTeam,
			JTextField fieldSalary, PlayerManager playerManager) {
		this.fieldNum = fieldNum;
		this.fieldName = fieldName;
		this.fieldTeam = fieldTeam;
		this.fieldSalary = fieldSalary;
		this.playerManager = playerManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PlayerInput player = new KLeague(PlayerKind.KLeague);
		try {
			player.setNumber(Integer.parseInt(fieldNum.getText()));
			player.setName(fieldName.getText());
			player.setTeam(fieldTeam.getText());
			player.setSal(fieldSalary.getText());
			playerManager.addPlayer(player);
			putObject(playerManager, "PlayerManager.ser");
			
			player.printInfo();
		} catch (NumberFormatException | NumberException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	public static void putObject(PlayerManager playerManager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out= new ObjectOutputStream(file);
			
			out.writeObject(playerManager);
			
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
