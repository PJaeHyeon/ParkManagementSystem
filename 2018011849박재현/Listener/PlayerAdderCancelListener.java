package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import gui.PlayerAdder;
import gui.PlayerViewer;
import gui.WindowFrame;

public class PlayerAdderCancelListener implements ActionListener {
	
	WindowFrame frame;

	public PlayerAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}
}
