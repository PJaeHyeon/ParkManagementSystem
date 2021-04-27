package PlayerManagement;

import java.util.Scanner;

public class Player {
	
	protected PlayerKind kind = PlayerKind.KLeague;
	protected String name;
	protected int number;
	protected String team;
	protected String sal;
	
	public Player() {
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

	public void setNumber(int number) {
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
	
	public void getUserInput(Scanner input) {
		System.out.print("Player Name:");
		String name = input.next(); //���� �̸� �Է�
		this.setName(name);
		System.out.print("Player Number:");
		int number = input.nextInt(); //���� ��ȣ �Է�	
		this.setNumber(number);
		System.out.print("Player's Team: ");
		String team = input.next(); //���� �Ҽ��� �Է�
		this.setTeam(team);
		System.out.print("Player's Salary(��): ");
		String sal = input.next() + "���"; //���� ���� �Է�
		this.setSal(sal);
	}

}
