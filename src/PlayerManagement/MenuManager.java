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
			System.out.println("1. Add Player                  *"); //Add Player 출력
			System.out.println("2. Delete Player               *"); //Delele Player 출력 
			System.out.println("3. Edit Player                 *"); //Edit Player 출력
			System.out.println("4. View Player                 *"); //View Player 출력
			System.out.println("5. Show a Menu                 *"); //Show a Menu 출력
			System.out.println("6. Exit                        *"); //Exit 출력
			System.out.println("================================"); //Input Layout
			
			System.out.print("Select one number between 1-6: "); //메뉴 넘버 유도 문장 출력
			num = input.nextInt(); //num 입력 int 변수 선언
			
			
			if(num == 1) { //num 1일때 addPlayer 함수실행
				playerManager.addPlayer();	 //Player리스트에 함수에서 리턴된값 추가
			}
			
			if(num == 2) { //num 2일때 deletePlayer 함수실행
				playerManager.deletePlayer();
			}
			if(num == 3) { //num 3일때 editPlayer 함수실행
				playerManager.editPlayer();
			}
			if(num == 4) { //num 4일때 viewPlayer 함수실행
				playerManager.viewPlayer();
			}
			else {
				continue;
			}
				
				
		}
		
				
					
		
	}

	
}
