package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import PlayerManagement.PlayerManager;
import gui.PlayerViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		PlayerViewer playerViewer = frame.getPlayerviewer();
		PlayerManager playerManager = getObject("PlayerManager.ser");
		playerViewer.setPlayerManager(playerManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(playerViewer);
		frame.revalidate();
		frame.repaint();
//		JButton b = (JButton) e.getSource();
//		PlayerViewer viewer = frame.getPlayerviewer();
//		frame.setupPanel(viewer);
	}
	
	public static PlayerManager getObject(String filename) {
		PlayerManager playerManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in= new ObjectInputStream(file);
			playerManager = (PlayerManager) in.readObject();
			
			in.close();
			file.close();
		
		} catch (FileNotFoundException e) {
			return playerManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return playerManager;	
	}
}
