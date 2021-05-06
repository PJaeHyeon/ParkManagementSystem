package PlayerManagement;

import java.util.Scanner;

public class KLeague extends Player implements PlayerInput{
	
	public KLeague(PlayerKind kind) {
		super(kind);
		}
	
	public void getUserInput(Scanner input) {
		System.out.print("Player Name:");
		String name = input.next(); //선수 이름 입력
		this.setName(name);
		System.out.print("Player Number:");
		int number = input.nextInt(); //선수 번호 입력	
		this.setNumber(number);
		System.out.print("Player's Team: ");
		String team = input.next(); //선수 소속팀 입력
		this.setTeam(team);
		System.out.print("Player's Salary(억): ");
		String sal = input.next() + "억원"; //선수 연봉 입력
		this.setSal(sal);
	}
	
	public void printInfo() {
		switch(this.kind) {
		case KLeague:
			pkind = "KLeague";
			break;
		case BundesLiga:
			pkind = "BundesLiga";
			break;
		case PremierLeague:
			pkind = "PremierLeague";
			break;
		case SerieA:
			pkind = "SerieA";
			break;
		default:
			
		}
		System.out.println("League :"+ pkind +", Name :" + name + ", Number:"+number+", Team:"+team+", Salary:"+sal);
	}

}
