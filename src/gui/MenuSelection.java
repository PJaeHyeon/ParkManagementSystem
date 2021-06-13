package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Listener.ButtonAddListener;
import Listener.ButtonViewListener;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.ORANGE);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.ORANGE);
		JPanel panel3 = new JPanel();
		
		JLabel label = new JLabel("Menu Selection");
		JLabel label2 = new JLabel("2018011849 ¹ÚÀçÇö PlayerManagement");
		
		JButton button1= new JButton("Add Player");
		JButton button2= new JButton("Delete Player");
		JButton button3= new JButton("Edit Player");
		JButton button4= new JButton("View Player");
		JButton button5= new JButton("Exit Program");		
		
		button1.addActionListener(new ButtonAddListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);

		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		panel3.add(label2,BorderLayout.CENTER);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.add(panel3, BorderLayout.SOUTH);
	}
}
