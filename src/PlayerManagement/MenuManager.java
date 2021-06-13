package PlayerManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);	
		PlayerManager playerManager = getObject("PlayerManager.ser");
		if(playerManager == null) {
			playerManager = new PlayerManager(input);
		}
		
		WindowFrame frame = new WindowFrame(playerManager);
		
		selectMenu(input, playerManager);
		putObject(playerManager, "PlayerManager.ser");
	}
	
	public static void selectMenu(Scanner input, PlayerManager playerManager) {
		int num = 0;
		while(num != 6){
			try {
				showMenu();
				System.out.print("Select one number between 1-6: "); //메뉴 넘버 유도 문장 출력
				num = input.nextInt(); //num 입력 int 변수 선언
				switch(num) {
				case 1:  //num 1일때 addPlayer 함수실행
					playerManager.addPlayer();
					logger.log("add a player");
					break;
				case 2:  //num 2일때 deletePlayer 함수실행
					playerManager.deletePlayer();
					logger.log("delete a player");
					break;
				case 3:  //num 3일때 editPlayer 함수실행
					playerManager.editPlayer();
					logger.log("edit a player");
					break;
				case 4:  //num 4일때 viewPlayer 함수실행
					playerManager.viewPlayer();
					logger.log("view a list of player");
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
		System.out.println("1. Add Player                  *"); //Add Player 출력
		System.out.println("2. Delete Player               *"); //Delele Player 출력 
		System.out.println("3. Edit Player                 *"); //Edit Player 출력
		System.out.println("4. View Player                 *"); //View Player 출력
		System.out.println("5. Show a Menu                 *"); //Show a Menu 출력
		System.out.println("6. Exit                        *"); //Exit 출력
		System.out.println("================================"); //Input Layout
	}
	
	public static PlayerManager getObject(String filename) {
		PlayerManager playerManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in= new ObjectInputStream(file);
			playerManager = (PlayerManager) in.readObject();
			
			in.close();
			file.close();
		
		} catch (FileNotFoundException e) {
			return playerManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return playerManager;	
	}
	public static void putObject(PlayerManager playerManager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out= new ObjectOutputStream(file);
			
			out.writeObject(playerManager);
			
			out.close();
			file.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
