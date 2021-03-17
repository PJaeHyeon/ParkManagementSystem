import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6){
			System.out.println("================================"); //Input Layout
			System.out.println("1. Add Player                  *"); //Add Player 출력
			System.out.println("2. Delete Player               *"); //Delele Player 출력
			System.out.println("3. Edit Player                 *"); //Edit Player 출력
			System.out.println("4. View Player                 *"); //View Player 출력
			System.out.println("5. Show a Menu                 *"); //Show a Menu 출력
			System.out.println("6. Exit                        *"); //Exit 출력
			System.out.println("Select one number between 1-6: *"); //메뉴 넘버 유도 문장 출력
			System.out.println("================================"); //Input Layout
			num = input.nextInt(); //num 입력 int 변수 선언
			switch(num) {        //num입력에 따른 스위치문
			case 1:
				System.out.print("Player Number: "); //
				int playernum = input.nextInt();
				System.out.print("Player Name: ");
				String playername = input.next();
				System.out.print("Player's Team: ");
				String playerteam = input.next();
				System.out.print("Player's Salary");
				int playersal = input.nextInt();
				
				System.out.println(playernum);
				System.out.println(playername);
				System.out.println(playerteam);
				System.out.println(playersal);
			
				break;
			case 2:
			case 3:
			case 4:
			case 5:
				
			}
			
			
		}
	}

}
