
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
		Player player = new Player();
		
		System.out.print("Player Name:");
		player.name = input.next(); //���� �̸� �Է�
		
		System.out.print("Player Number:");
		player.number = input.nextInt(); //���� ��ȣ �Է�		
		
		System.out.print("Player's Team: ");
		player.team = input.next(); //���� �Ҽ��� �Է�
		
		
		System.out.print("Player's Salary(��): ");
		player.sal = input.next(); //���� ���� �Է�
		
		players.add(player);

	}

	public void deletePlayer() { //����Ʈ�� ���ڷ� �޴� deletePlayer �Լ� ����

		System.out.print("Player's Number: ");
		int playernum = input.nextInt();
		int index = -1;
		for(int i = 0; i<players.size(); i++) {
			if(players.get(i).number == playernum) {
				index = i;
				break;
			}
		}
		if (index >=0) {
			players.remove(index);
			System.out.println("the player "+ playernum +" is deleted");
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
			if(player.number == playernum) {
				int num = -1;
				System.out.println("---------");
				System.out.println("1.Name");
				System.out.println("2.Number");
				System.out.println("3.Team");
				System.out.println("4.Salary");
				System.out.println("---------");

				System.out.print("������ �׸� ��ȣ�� �Է��ϼ���:"); 
				num = input.nextInt();
				if(num == 1) { 									//�Է��� �Լ��� 1�϶�
					System.out.print("������ �̸� �Է�: ");
					player.name = input.next();
				}
				else if(num == 2) {									//�Է��� �Լ��� 2�϶�
					System.out.print("������ ��ȣ �Է�: ");
					player.number = input.nextInt();
				}
				else if(num == 3) {									//�Է��� �Լ��� 3�϶�
					System.out.print("������ �� �Է�: ");
					player.team = input.next();
				}
				else if(num == 4) {									//�Է��� �Լ��� 4�϶�
					System.out.print("������ ���� �Է�: ");
					player.sal = input.next();
				}	


				System.out.println("the player to be edited is "+playernum);

			}
		}

	}
	public void viewPlayer() { //����Ʈ�� ���ڷ� �޴� viewPlayer �Լ�����
		System.out.print("Player's Number(view all enter 0): ");
		int playernum = input.nextInt();
		if(playernum == 0) {
			for (int i = 0;i<players.size();i++) {
				players.get(i).printInfo();
			}
		}
		else {
			players.get(playernum-1).printInfo();
		}
		
		
	}
}


