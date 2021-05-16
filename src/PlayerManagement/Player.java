package PlayerManagement;

import java.util.Scanner;

import Exception.NumberException;

public abstract class  Player implements PlayerInput{
	
	protected PlayerKind kind = PlayerKind.KLeague;
	protected String name;
	protected int number;
	protected String team;
	protected String sal;
	
	public Player() {
	}
	
	public Player(PlayerKind kind) {
		this.kind = kind;
	}
	
	public Player(String name,int number) 
	{
		this.name = name;
		this.number= number;
	}
	
	public Player(String name, int number, String team, String sal) {
		this.name = name;
		this.number = number;
		this.team=team;
		this.sal=sal;
	}
	
	public Player(PlayerKind kind, String name, int number, String team, String sal) {
		this.kind = kind;
		this.name = name;
		this.number = number;
		this.team=team;
		this.sal=sal;
	}
	
	public PlayerKind getKind() {
		return kind;
	}

	public void setKind(PlayerKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) throws NumberException{
		if(number>=100) {
			throw new NumberException();
		}
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	String pkind = "none";
	
	public abstract void printInfo(); 
	
	public void setPlayerName(Scanner input) {
		System.out.print("Player Name: ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setPlayerNum(Scanner input) {
		int number = 101;
		while(number>=100) {
			System.out.print("Player Num: ");
			number = input.nextInt();
			try {
				this.setNumber(number);
			} catch (NumberException e) {
				System.out.println("Incorrect Number(0<number<100)");
			}
		}
	}
	
	public void setPlayerTeam(Scanner input) {
		System.out.print("Player Team: ");
		String team = input.next();
		this.setTeam(team);
	}
	
	public void setPlayerSal(Scanner input) {
		System.out.print("Player Salary($): ");
		String sal = input.next();
		this.setSal(sal);
	}
	
	public String getKindString() {
		String pkind = "none";
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
		return pkind;
		
	}
		
	


}
