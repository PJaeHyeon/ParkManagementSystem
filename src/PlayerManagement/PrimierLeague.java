package PlayerManagement;

import java.util.Scanner;

public class PrimierLeague extends Player {
	public void getUserInput(Scanner input) {
		
		
		System.out.print("Player Number:");
		int number = input.nextInt(); //선수 번호 입력	
		this.setNumber(number);
		
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Can Speak English? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y'|| answer == 'Y') {
				System.out.print("Player Name by English:");
				String name = input.next(); //선수 이름 입력
				this.setName(name);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				System.out.print("Player Name by Korean:");
				String name = input.next(); //선수 이름 입력
				this.setName(name);
				break;

			}
			else {
			}
		}
		
		System.out.print("Player's Team: ");
		String team = input.next(); //선수 소속팀 입력
		this.setTeam(team);
		
		System.out.print("Player's Salary($): ");
		String sal = input.next(); //선수 연봉 입력
		this.setSal(sal);
	}

}
