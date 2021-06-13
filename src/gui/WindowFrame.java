package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import PlayerManagement.PlayerManager;

public class WindowFrame extends JFrame {
	PlayerManager playerManager;
	MenuSelection menuselection;
	PlayerAdder playeradder;
	PlayerViewer playerviewer;

	public WindowFrame(PlayerManager playerManager) {
		
		this.setSize(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.playerManager = playerManager;
		this.menuselection = new MenuSelection(this);
		this.playeradder = new PlayerAdder(this,this.playerManager);
		this.playerviewer = new PlayerViewer(this,this.playerManager);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public PlayerAdder getPlayeradder() {
		return playeradder;
	}

	public void setPlayeradder(PlayerAdder playeradder) {
		this.playeradder = playeradder;
	}

	public PlayerViewer getPlayerviewer() {
		return playerviewer;
	}

	public void setPlayerviewer(PlayerViewer playerviewer) {
		this.playerviewer = playerviewer;
	}

}
