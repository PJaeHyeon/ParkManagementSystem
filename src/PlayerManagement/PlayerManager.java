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
	
	public void addPlayer() { //����Ʈ�� ���ڷ� �޴� addPlayer�Լ� ����
		
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

	public void deletePlayer() { //����Ʈ�� ���ڷ� �޴� deletePlayer �Լ� ����

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
	
	public void editPlayer() { //����Ʈ�� ���ڷ� �޴� editPlayer �Լ� ����

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

				System.out.print("������ �׸� ��ȣ�� �Է��ϼ���:"); 
				num = input.nextInt();
				if(num == 1) { 									//�Է��� �Լ��� 1�϶�
					System.out.print("������ �̸� �Է�: ");
					String name = input.next();
					player.setName(name);
				}
				else if(num == 2) {									//�Է��� �Լ��� 2�϶�
					System.out.print("������ ��ȣ �Է�: ");
					int number = input.nextInt();
					player.setNumber(number);
				}
				else if(num == 3) {									//�Է��� �Լ��� 3�϶�
					System.out.print("������ �� �Է�: ");
					String team = input.next();
					player.setTeam(team);
				}
				else if(num == 4) {									//�Է��� �Լ��� 4�϶�
					System.out.print("������ ���� �Է�: ");
					String sal = input.next();
					player.setSal(sal);
				}	


				System.out.println("the player to be edited is "+playernum);

			}
		}

	}
	public void viewPlayer() { //viewPlayer �Լ�����
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


