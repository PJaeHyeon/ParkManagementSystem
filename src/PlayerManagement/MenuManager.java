package PlayerManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		PlayerManager playerManager = new PlayerManager(input);
		int num = 0;
		
		while(num != 6){
			System.out.println("================================"); //Input Layout 
			System.out.println("1. Add Player                  *"); //Add Player ���
			System.out.println("2. Delete Player               *"); //Delele Player ��� 
			System.out.println("3. Edit Player                 *"); //Edit Player ���
			System.out.println("4. View Player                 *"); //View Player ���
			System.out.println("5. Show a Menu                 *"); //Show a Menu ���
			System.out.println("6. Exit                        *"); //Exit ���
			System.out.println("================================"); //Input Layout
			
			System.out.print("Select one number between 1-6: "); //�޴� �ѹ� ���� ���� ���
			num = input.nextInt(); //num �Է� int ���� ����
			
			
			if(num == 1) { //num 1�϶� addPlayer �Լ�����
				playerManager.addPlayer();	 //Player����Ʈ�� �Լ����� ���ϵȰ� �߰�
			}
			
			if(num == 2) { //num 2�϶� deletePlayer �Լ�����
				playerManager.deletePlayer();
			}
			if(num == 3) { //num 3�϶� editPlayer �Լ�����
				playerManager.editPlayer();
			}
			if(num == 4) { //num 4�϶� viewPlayer �Լ�����
				playerManager.viewPlayer();
			}
			else {
				continue;
			}
				
				
		}
		
				
					
		
	}

	
}
