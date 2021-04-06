package PlayerManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
	ArrayList<Player> players= new ArrayList<Player>();
	Player player;
	Scanner input;
	PlayerManager(Scanner input){
		this.input =input;
	}
	
	public void addPlayer() { //리스트를 인자로 받는 addPlayer함수 정의
		
		int kind = 0 ;
		Player player;
		while(true) {
			System.out.println("1.K League");
			System.out.println("2.Primier League");
			System.out.println("3.BundesLiga");
			System.out.println("4.SerieA");
			System.out.print("Select num for Player's League:");
			kind = input.nextInt();
			if (kind == 1) {
				player = new Player();
				player.getUserInput(input);
				players.add(player);
				break;
			}
			else if(kind == 2) {
				player = new PrimierLeague();
				player.getUserInput(input);
				players.add(player);
				break;
			}
			else if(kind == 3) {
				player = new BundesLiga();
				player.getUserInput(input);
				players.add(player);
				break;
			}
			else if(kind == 4) {
				player = new SerieA();
				player.getUserInput(input);
				players.add(player);
				break;
			}
			
			
			else {
				System.out.println("Select num for Player's League 1~4");
			}
		}
		



	}

	public void deletePlayer() { //리스트를 인자로 받는 deletePlayer 함수 정의

		System.out.print("Player's Number: ");
		int playernum = input.nextInt();
		
		
		int index = -1;
		for(int i = 0; i<players.size(); i++) {
			if(players.get(i).getNumber() == playernum) {
				index = i;
				break;
			}
		}
		if (index >=0) {
			players.remove(index);
			System.out.println("the player "+ playernum +" is deleted");
			index = -1;
		}
		else {
			System.out.println("the player has not been registered");
			return;
		}
			
		
	}
	
	public void editPlayer() { //리스트를 인자로 받는 editPlayer 함수 정의

		System.out.print("Player's Number: ");
		int playernum = input.nextInt();
		for(int i=0;i<players.size();i++) {
			Player player = players.get(i);
			if(player.getNumber() == playernum) {
				int num = -1;
				System.out.println("---------");
				System.out.println("1.Edit Name");
				System.out.println("2.Edit Number");
				System.out.println("3.Edit Team");
				System.out.println("4.Edit Salary");
				System.out.println("---------");

				System.out.print("수정할 항목 번호를 입력하세요:"); 
				num = input.nextInt();
				if(num == 1) { 									//입력한 함수가 1일때
					System.out.print("수정할 이름 입력: ");
					String name = input.next();
					player.setName(name);
				}
				else if(num == 2) {									//입력한 함수가 2일때
					System.out.print("수정할 번호 입력: ");
					int number = input.nextInt();
					player.setNumber(number);
				}
				else if(num == 3) {									//입력한 함수가 3일때
					System.out.print("수정할 팀 입력: ");
					String team = input.next();
					player.setTeam(team);
				}
				else if(num == 4) {									//입력한 함수가 4일때
					System.out.print("수정할 연봉 입력: ");
					String sal = input.next();
					player.setSal(sal);
				}	


				System.out.println("the player to be edited is "+playernum);

			}
		}

	}
	public void viewPlayer() { //viewPlayer 함수정의
		System.out.print("Player's Number(view all enter 0): ");
		int playernum = input.nextInt();
		if(playernum == 0) {
			for (int i = 0;i<players.size();i++) {
				players.get(i).printInfo();
			}
		}
		else {
			for(int j = 0;j<players.size();j++) {
				if(playernum == players.get(j).getNumber()) {
					players.get(j).printInfo();
				}
				else {
					System.out.println("The player has not been registered!!");
				}	
			}
		}
	}
}


