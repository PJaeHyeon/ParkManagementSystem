

import java.util.Scanner;

public class Player {
	

	String name;
	int number;
	String team ;
	String sal;
	
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
	
	public void printInfo() {
		System.out.println("Name :" + name + ", Number:"+number+", Team:"+team+", Salary:"+sal+"억원");

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

	
	public void printInfo() {
		System.out.println("Name :" + name + ", Number:"+number+", Team:"+team+", Salary:"+sal+"�뼲�썝");
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Player Name:");
		String name = input.next(); //�꽑�닔 �씠由� �엯�젰
		this.setName(name);
		System.out.print("Player Number:");
		int number = input.nextInt(); //�꽑�닔 踰덊샇 �엯�젰	
		this.setNumber(number);
		System.out.print("Player's Team: ");
		String team = input.next(); //�꽑�닔 �냼�냽�� �엯�젰
		this.setTeam(team);
		System.out.print("Player's Salary(�뼲): ");
		String sal = input.next(); //�꽑�닔 �뿰遊� �엯�젰
		this.setSal(sal);

	}

}
