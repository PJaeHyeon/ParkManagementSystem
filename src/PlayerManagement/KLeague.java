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
		
		System.out.print("Player's Salary(억): ");
		String sal = input.next() + "억원"; //선수 연봉 입력
		this.setSal(sal);
	}
	
	public void printInfo() {
		String pkind = getKindString();
		System.out.println("League :"+ pkind +", Name :" + name + ", Number:"+number+", Team:"+team+", Salary:"+sal);
	}
	
	

}
