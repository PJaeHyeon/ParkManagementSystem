package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class PlayerAdder extends JFrame{
	public PlayerAdder() {
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
		panel.add(labelSalary);
		panel.add(fieldSalary);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel,5,2,6,6,6,6);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setContentPane(panel);
		this.setVisible(true);
		
	}

}
