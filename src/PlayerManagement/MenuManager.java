package PlayerManagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		PlayerManager playerManager = new PlayerManager(input);
		
		selectMenu(input, playerManager);	
	}
	
	public static void selectMenu(Scanner input, PlayerManager playerManager) {
		int num = 0;
		while(num != 6){
			try {
				showMenu();
				System.out.print("Select one number between 1-6: "); //�޴� �ѹ� ���� ���� ���
				num = input.nextInt(); //num �Է� int ���� ����
				switch(num) {
				case 1:  //num 1�϶� addPlayer �Լ�����
					playerManager.addPlayer();	 
					break;
				case 2:  //num 2�϶� deletePlayer �Լ�����
					playerManager.deletePlayer();
					break;
				case 3:  //num 3�϶� editPlayer �Լ�����
					playerManager.editPlayer();
					break;
				case 4:  //num 4�϶� viewPlayer �Լ�����
					playerManager.viewPlayer();
					break;
				default:
					continue;
				}		
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 6!!");
				if (input.hasNext()) {
					input.next();
				}
				num = 0;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("================================"); //Input Layout 
		System.out.println("1. Add Player                  *"); //Add Player ���
		System.out.println("2. Delete Player               *"); //Delele Player ��� 
		System.out.println("3. Edit Player                 *"); //Edit Player ���
		System.out.println("4. View Player                 *"); //View Player ���
		System.out.println("5. Show a Menu                 *"); //Show a Menu ���
		System.out.println("6. Exit                        *"); //Exit ���
		System.out.println("================================"); //Input Layout
	}
}
