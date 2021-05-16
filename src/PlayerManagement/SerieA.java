package PlayerManagement;

import java.util.Scanner;

public class SerieA extends WorldPlayer implements PlayerInput {
	
	public SerieA(PlayerKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		
		setPlayerNum(input);
		playerNameset(input);
		setPlayerTeam(input);
		setPlayerSal(input);
	}
	
	
	
	public void printInfo() {
		String pkind = getKindString();
		System.out.println("League :"+ pkind +", Name :" + name + ", Number:"+number+", Team:"+team+", Salary:"+sal);
	}
	
}
