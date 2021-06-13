package PlayerManagement;

import java.util.Scanner;

public class BundesLiga extends Player implements PlayerInput {
	
	public BundesLiga(PlayerKind kind) {
		super(kind);
	}
	
	
	
	public void getUserInput(Scanner input) {
		
		setPlayerNum(input);
		setPlayerName(input);
		setPlayerTeam(input);
		setPlayerDE(input);
		
	}
	public void setPlayerDE(Scanner input) {
		char answer = 'x';
		while(answer !='d' && answer !='D' && answer !='u' && answer !='U') 
		{
			System.out.print("What kind of yout Salary's Dollar or Euro(D/E):");
			answer = input.next().charAt(0);
			
			if(answer == 'd'|| answer == 'D') 
			{
				System.out.print("Player's Salary($):");
				String sal = input.next() + "$"; //선수 이름 입력
				this.setSal(sal);
				break;
			}
			else if(answer == 'e' || answer == 'E') 
			{
				System.out.print("Player's Salary(€): ");
				String sal = input.next()+"€"; //선수 이름 입력
				this.setSal(sal);
				break;

			}
			else {
			}
		}
	}
	
	public void printInfo() {
		
		String pkind = getKindString();
		System.out.println("League :"+ pkind +", Name :" + name + ", Number:"+number+", Team:"+team+", Salary:"+sal);
	}
	
	
}
