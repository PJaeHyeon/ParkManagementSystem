package PlayerManagement;

import java.util.Scanner;

public class KLeague extends Player implements PlayerInput{
	
	public KLeague(PlayerKind kind) {
		super(kind);
		}
	
	public void getUserInput(Scanner input) {
		System.out.print("Player Name:");
		String name = input.next(); //���� �̸� �Է�
		this.setName(name);
		System.out.print("Player Number:");
		int number = input.nextInt(); //���� ��ȣ �Է�	
		this.setNumber(number);
		System.out.print("Player's Team: ");
		String team = input.next(); //���� �Ҽ��� �Է�
		this.setTeam(team);
		System.out.print("Player's Salary(��): ");
		String sal = input.next() + "���"; //���� ���� �Է�
		this.setSal(sal);
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
