package PlayerManagement;

import java.util.Scanner;

public class KLeague extends Player implements PlayerInput{
	
	public KLeague(PlayerKind kind) {
		super(kind);
		}
	
	public void getUserInput(Scanner input) {
		setPlayerNum(input);
		setPlayerName(input);
		setPlayerTeam(input);
		
		System.out.print("Player's Salary(��): ");
		String sal = input.next() + "���"; //���� ���� �Է�
		this.setSal(sal);
	}
	
	public void printInfo() {
		String pkind = getKindString();
		System.out.println("League :"+ pkind +", Name :" + name + ", Number:"+number+", Team:"+team+", Salary:"+sal);
	}
	
	

}
