package PlayerManagement;

import java.util.Scanner;

public class BundesLiga extends Player implements PlayerInput {
	
	public BundesLiga(PlayerKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		
		
		System.out.print("Player Number:");
		int number = input.nextInt(); //���� ��ȣ �Է�	
		this.setNumber(number);
		
		System.out.print("Player Name:");
		String name = input.next(); //���� �̸� �Է�
		this.setName(name);
		
		System.out.print("Player's Team: ");
		String team = input.next(); //���� �Ҽ��� �Է�
		this.setTeam(team);
		
		char answer = 'x';
		while(answer !='d' && answer !='D' && answer !='u' && answer !='U') {
			System.out.print("What kind of yout Salary's Dollar or Euro(D/E):");
			answer = input.next().charAt(0);
			if(answer == 'd'|| answer == 'D') {
				System.out.print("Player's Salary($):");
				String sal = input.next() + "$"; //���� �̸� �Է�
				this.setSal(sal);
				break;
			}
			else if(answer == 'e' || answer == 'E') {
				System.out.print("Player's Salary(��): ");
				String sal = input.next()+"��"; //���� �̸� �Է�
				this.setSal(sal);
				break;

			}
			else {
			}
		}

	}
	public void printInfo() {
		switch(this.kind) {
		case KLeague:
			pkind = "KLeague";
			break;
		case BundesLiga:
			pkind = "BundesLiga";
			break;
		case PremierLeague:
			pkind = "PremierLeague";
			break;
		case SerieA:
			pkind = "SerieA";
			break;
		default:
			
		}
		System.out.println("League :"+ pkind +", Name :" + name + ", Number:"+number+", Team:"+team+", Salary:"+sal);
	}
	

}
