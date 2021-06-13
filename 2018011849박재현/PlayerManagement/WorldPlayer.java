package PlayerManagement;

import java.util.Scanner;

public class WorldPlayer extends Player {
	
	public WorldPlayer(PlayerKind kind) {
		super(kind);
	}
	
	public void playerNameset(Scanner input) {
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Can Speak English? (Y/N):");
			answer = input.next().charAt(0);
			if(answer == 'y'|| answer == 'Y') {
				System.out.print("Player Name by English:");
				String name = input.next(); 
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
		
	}

	@Override
	public void getUserInput(Scanner input) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub

	}

}
