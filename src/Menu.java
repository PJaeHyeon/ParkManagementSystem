import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6){
			System.out.println("================================");
			System.out.println("1. Add Player                  *");
			System.out.println("2. Delete Player               *");
			System.out.println("3. Edit Player                 *");
			System.out.println("4. View Player                 *");
			System.out.println("5. Show a Menu                 *");
			System.out.println("6. Exit                        *");
			System.out.println("Select one number between 1-6: *");
			System.out.println("================================");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("Player Number: ");
				int	playernum = input.nextInt();
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
