package PlayerManagement;

import java.util.Scanner;

public class BundesLiga extends Player  {
	public void getUserInput(Scanner input) {
		
		this.setKind(PlayerKind.BundesLiga);
		
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
	

}
