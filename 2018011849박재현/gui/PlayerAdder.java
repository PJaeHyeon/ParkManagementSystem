package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.PlayerAdderCancelListener;
import Listener.PlayerAdderListener;
import PlayerManagement.PlayerManager;

public class PlayerAdder extends JPanel{
	
	WindowFrame frame;	
	PlayerManager playerManager;
	
	public PlayerAdder(WindowFrame frame,PlayerManager playerManager) {
		this.frame = frame;
		this.playerManager = playerManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNum = new JLabel("Player's Number: ", JLabel.TRAILING);
		JTextField fieldNum = new JTextField(10);
		labelNum.setLabelFor(fieldNum);
		panel.add(labelNum);
		panel.add(fieldNum);
		
		JLabel labelName = new JLabel("Player's Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelNum.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelTeam = new JLabel("Player's Team: ", JLabel.TRAILING);
		JTextField fieldTeam = new JTextField(10);
		labelNum.setLabelFor(fieldTeam);
		panel.add(labelTeam);
		panel.add(fieldTeam);
		
		JLabel labelSalary = new JLabel("Player's Salary: ", JLabel.TRAILING);
		JTextField fieldSalary = new JTextField(10);
		labelNum.setLabelFor(fieldSalary);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new PlayerAdderListener(fieldNum,fieldName,fieldTeam,fieldSalary,playerManager));
				
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new PlayerAdderCancelListener(frame));
		
		panel.add(labelSalary);
		panel.add(fieldSalary);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel,5,2,6,6,6,6);
		
		this.add(panel);
		this.setVisible(true);	
	}
}
