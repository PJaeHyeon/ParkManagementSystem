import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
	public static ArrayList<String> addPlayer() { //����Ʈ�� ���ڷ� �޴� addPlayer�Լ� ����

		Scanner input = new Scanner(System.in); //Scanner ����

		System.out.print("Player Name:");
		String playername = input.nextLine(); //���� �̸� �Է�
		String name = "���� �̸��� :" + playername + "\n"; 

		System.out.print("Player Number:");
		String playernum = input.nextLine(); //���� ��ȣ �Է�		
		String num =  "��ȣ�� :" + playernum + "��\n";

		System.out.print("Player's Team: ");
		String playerteam = input.nextLine(); //���� �Ҽ��� �Է�
		String team = "���� :" + playerteam + "\n";

		System.out.print("Player's Salary(��): ");
		String playersal = input.nextLine(); //���� ���� �Է�
		String sal =  "������ :"+ playersal + "��";

		ArrayList<String> player = new ArrayList<String>(); //�Լ����� ����Ʈ ����

		player.add(name); //����Ʈ�� �̸� �Է�
		player.add(num); //����Ʈ�� ��ȣ �Է�
		player.add(team); //����Ʈ�� �� �Է�
		player.add(sal); //����Ʈ�� �����Է�

		return player; //����Ʈ�� �Լ��� ��ȯ

	}

	public static void deletePlayer(ArrayList<String> a) { //����Ʈ�� ���ڷ� �޴� deletePlayer �Լ� ����
		
		a.removeAll(a); //����Ʈ���մ� ��ҵ� ����
		System.out.println("Delete ALL!!"); 
	}
	public static void editPlayer(ArrayList<String> a) { //����Ʈ�� ���ڷ� �޴� editPlayer �Լ� ����
		
		int num = 0;
		Scanner input = new Scanner(System.in);
			
		System.out.println("1.Name");
		System.out.println("2.Number");
		System.out.println("3.Team");
		System.out.println("4.Salary");
		
		System.out.print("������ �׸� ��ȣ�� �Է��ϼ���:"); 
		num = input.nextInt();
		if(num == 1) { 									//�Է��� �Լ��� 1�϶�
			Scanner input2 = new Scanner(System.in);
			System.out.print("������ �̸� �Է�: ");
			String name = input2.nextLine();
			a.set(0, "���� �̸���:"+name+"\n");     //�Է¹��� ���� ����Ʈa�� 0���� ���� ��ü
		}
		if(num == 2) {									//�Է��� �Լ��� 2�϶�
			Scanner input3 = new Scanner(System.in);
			System.out.print("������ ��ȣ �Է�: ");
			String numb = input3.nextLine();
			a.set(1,"��ȣ��:"+numb+"��\n");  //�Է¹��� ���� ����Ʈa�� 1���� ���� ��ü
		}
		if(num == 3) {									//�Է��� �Լ��� 3�϶�
			Scanner input4 = new Scanner(System.in);
			System.out.print("������ �� �Է�: ");
			String team = input4.nextLine();
			a.set(2, "����:"+team+"\n");    //�Է¹��� ���� ����Ʈa�� 2���� ���� ��ü
		}
		if(num == 4) {									//�Է��� �Լ��� 4�϶�
			Scanner input5 = new Scanner(System.in);
			System.out.print("������ ���� �Է�: ");
			String sal = input5.nextLine();
			a.set(3, "������:"+sal+"\n");        //�Է¹��� ���� ����Ʈa�� 3���� ���� ��ü
		}	

	}
	public static void viewPlayer(ArrayList<String> a) { //����Ʈ�� ���ڷ� �޴� viewPlayer �Լ�����
		System.out.println(a);  //����Ʈ a ���
	}
	
}
