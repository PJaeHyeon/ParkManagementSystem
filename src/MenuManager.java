
import java.util.ArrayList;
import java.util.Scanner;


public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		ArrayList<String> player = new ArrayList<String>(); //메인함수에들어갈 player리스트 정의
		
		
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
			
			
			if(num == 1) { //num 1일때 addPlayer 함수실행
				player.addAll(addPlayer());	 //Player리스트에 함수에서 리턴된값 추가
			}
			
			if(num == 2) { //num 2일때 deletePlayer 함수실행
				deletePlayer(player);
			}
			if(num == 3) { //num 3일때 editPlayer 함수실행
				editPlayer(player);
			}
			if(num == 4) { //num 4일때 viewPlayer 함수실행
				viewPlayer(player);
			}
			else {
				continue;
			}
				
				
		}
		
				
					
		
	}

	public static ArrayList<String> addPlayer() { //리스트를 인자로 받는 addPlayer함수 정의
		
		Scanner input = new Scanner(System.in); //Scanner 정으
		
		System.out.print("Player Name:");
		String playername = input.nextLine(); //선수 이름 입력
		String name = "선수 이름은 :" + playername + "\n"; 
		
		System.out.print("Player Number:");
		String playernum = input.nextLine(); //선수 번호 입력		
		String num =  "번호는 :" + playernum + "번\n";
		
		System.out.print("Player's Team: ");
		String playerteam = input.nextLine(); //선수 소속팀 입력
		String team = "팀은 :" + playerteam + "\n";
		
		System.out.print("Player's Salary(억): ");
		String playersal = input.nextLine(); //선수 연봉 입력
		String sal =  "연봉은 :"+ playersal + "억";
		
		ArrayList<String> player = new ArrayList<String>(); //함수안의 리스트 정의
		
		player.add(name); //리스트에 이름 입력
		player.add(num); //리스트에 번호 입력
		player.add(team); //리스트에 팀 입력
		player.add(sal); //리스트에 연봉입력
		
		return player; //리스트를 함수에 반환
		
	}
	
	public static void deletePlayer(ArrayList<String> a) { //리스트를 인자로 받는 deletePlayer 함수 정의
		
		a.removeAll(a); //리스트에잇는 요소들 제거
		System.out.println("Delete ALL!!"); 
	}
	public static void editPlayer(ArrayList<String> a) { //리스트를 인자로 받는 editPlayer 함수 정의
		
		int num = 0;
		Scanner input = new Scanner(System.in);
			
		System.out.println("1.Name");
		System.out.println("2.Number");
		System.out.println("3.Team");
		System.out.println("4.Salary");
		
		System.out.print("수정할 항목 번호를 입력하세요:"); 
		num = input.nextInt();
		if(num == 1) { 									//입력한 함수가 1일때
			Scanner input2 = new Scanner(System.in);
			System.out.print("수정할 이름 입력: ");
			String name = input2.nextLine();
			a.set(0, "선수 이름은:"+name+"\n");     //입력받은 값을 리스트a의 0번지 값과 교체
		}
		if(num == 2) {									//입력한 함수가 2일때
			Scanner input3 = new Scanner(System.in);
			System.out.print("수정할 번호 입력: ");
			String numb = input3.nextLine();
			a.set(1,"번호는:"+numb+"번\n");  //입력받은 값을 리스트a의 1번지 값과 교체
		}
		if(num == 3) {									//입력한 함수가 3일때
			Scanner input4 = new Scanner(System.in);
			System.out.print("수정할 팀 입력: ");
			String team = input4.nextLine();
			a.set(2, "팀은:"+team+"\n");    //입력받은 값을 리스트a의 2번지 값과 교체
		}
		if(num == 4) {									//입력한 함수가 4일때
			Scanner input5 = new Scanner(System.in);
			System.out.print("수정할 연봉 입력: ");
			String sal = input5.nextLine();
			a.set(3, "연봉은:"+sal+"\n");        //입력받은 값을 리스트a의 3번지 값과 교체
		}	

	}
	public static void viewPlayer(ArrayList<String> a) { //리스트를 인자로 받는 viewPlayer 함수정의
		System.out.println(a);  //리스트 a 출력
	}
	
}
