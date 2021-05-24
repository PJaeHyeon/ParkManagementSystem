package PlayerManagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1692794031481506985L;
	
	ArrayList<PlayerInput> players= new ArrayList<PlayerInput>();
	Player player;
	transient Scanner input;
	PlayerManager(Scanner input){
		this.input =input;
	}
	
	public void addPlayer() { //리스트를 인자로 받는 addPlayer함수 정의
		
		int kind = 0 ;
		PlayerInput playerInput;
		while(true) {
			try {
				System.out.println("1.K League");
				System.out.println("2.Primier League");
				System.out.println("3.BundesLiga");
				System.out.println("4.SerieA");
				System.out.print("Select num for Player's League(1-4):");
				kind = input.nextInt();
				if (kind == 1) {
					playerInput = new KLeague(PlayerKind.KLeague);
					playerInput.getUserInput(input);
					players.add(playerInput);
					break;
				}
				else if(kind == 2) {
					playerInput = new PrimierLeague(PlayerKind.PremierLeague);
					playerInput.getUserInput(input);
					players.add(playerInput);
					break;
				}
				else if(kind == 3) {
					playerInput = new BundesLiga(PlayerKind.BundesLiga);
					playerInput.getUserInput(input);
					players.add(playerInput);
					break;
				}
				else if(kind == 4) {
					playerInput = new SerieA(PlayerKind.SerieA);
					playerInput.getUserInput(input);
					players.add(playerInput);
					break;
				}
				else {
					System.out.println("Select num for Player's League 1~4");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!!");
				if (input.hasNext()) {
					input.next();
				}
				kind = 0;
			}
		}
	}

	public void deletePlayer() { //deletePlayer 함수 정의

		System.out.print("Player's Number: ");
		int playernum = input.nextInt();
		
		int index = findIndex(playernum);
		
		removefromPlayers(index,playernum);
		
	}
	
	public int findIndex(int playernum) {
		int index = -1;
		for(int i = 0; i<players.size(); i++) {
			if(players.get(i).getNumber() == playernum) {
				index = i;
				break;
			}
		}
		return index;
		
	}
	
	public int removefromPlayers(int index,int playernum) {
		if (index >=0) {
			players.remove(index);
			System.out.println("the player "+ playernum +" is deleted");
			return 1;
		}
		else {
			System.out.println("the player has not been registered");
			return -1;
		}
	}
	
	public void editPlayer() { //리스트를 인자로 받는 editPlayer 함수 정의

		System.out.print("Player's Number: ");
		int playernum = input.nextInt();
		for(int i=0;i<players.size();i++) {
			PlayerInput player = players.get(i);
			if(player.getNumber() == playernum) {
				int num = -1;
				showEditMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					player.setPlayerName(input);
					break;
				case 2:
					player.setPlayerNum(input);
					break;
				case 3:
					player.setPlayerTeam(input);
					break;
				case 4:
					player.setPlayerSal(input);
					break;
				default:
					continue;
				}	
				
			}
		}
	}
	
	public void viewPlayer() { //viewPlayer 함수정의
//		System.out.print("Player's Number(view all enter 0): ");
//		int playernum = input.nextInt();
//		if(playernum == 0) {
//			for (int i = 0;i<players.size();i++) {
//				players.get(i).printInfo();
//			}
//		}
//		else {
//			for(int j = 0;j<players.size();j++) {
//				if(playernum == players.get(j).getNumber()) {
//					players.get(j).printInfo();
//				}
//				else {
//					System.out.println("The player has not been registered!!");
//				}	
//			}
//		}
		for (int i = 0;i<players.size();i++) {
			players.get(i).printInfo();
		}
	}
	
	
	public void showEditMenu() {
		System.out.println("---------");
		System.out.println("1.Edit Name");
		System.out.println("2.Edit Number");
		System.out.println("3.Edit Team");
		System.out.println("4.Edit Salary");
		System.out.println("---------");
		System.out.print("수정할 항목 번호를 입력하세요:"); 
	}
}


