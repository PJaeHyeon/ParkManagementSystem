
import java.util.Scanner;


public class Menu {

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
			System.out.println("================================"); //Input Layout
			
			System.out.print("Select one number between 1-6: "); //메뉴 넘버 유도 문장 출력
			num = input.nextInt(); //num 입력 int 변수 선언
			
			int playernum , playersal;	
			String playername,playerteam;
			
			switch(num){						//num입력에 따른 스위치문
				
			case 1:
				System.out.print("Player Number: "); 
				playernum = input.nextInt(); //선수 번호 입력
				System.out.print("Player Name: ");
				playername = input.next(); //선수 이름 입력
				System.out.print("Player's Team: ");
				playerteam = input.next(); //선수 소속팀 입력
				System.out.print("Player's Salary: ");
				playersal = input.nextInt(); //선수 연봉 입력
				
				System.out.printf("PlayerNumber is : %d \n",playernum); //선수 번호 출력
				System.out.printf("PlayerName is : %s \n",playername); //선수 이름 출력
				System.out.printf("PlayerTeam is : %s \n",playerteam); //선수 팀 출력
				System.out.printf("PlayerSalary is : %d $ \n",playersal);//선수 연봉 출력
				
				break;
			
			case 2:
				
			case 3:
				
			case 4:
				
			case 5:
				
			}
				
				
			}
				
					
		
	}

}

