package PlayerManagement;

import java.util.Scanner;

public class PrimierLeague extends Player {
	public void getUserInput(Scanner input) {
		
		
		System.out.print("Player Number:");
		int number = input.nextInt(); //���� ��ȣ �Է�	
		this.setNumber(number);
		
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Can Speak English? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y'|| answer == 'Y') {
				System.out.print("Player Name by English:");
				String name = input.next(); //���� �̸� �Է�
				this.setName(name);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				System.out.print("Player Name by Korean:");
				String name = input.next(); //���� �̸� �Է�
				this.setName(name);
				break;

			}
			else {
			}
		}
		
		System.out.print("Player's Team: ");
		String team = input.next(); //���� �Ҽ��� �Է�
		this.setTeam(team);
		
		System.out.print("Player's Salary($): ");
		String sal = input.next(); //���� ���� �Է�
		this.setSal(sal);
	}

}
