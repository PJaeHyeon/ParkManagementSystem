
public class Player {
	
	String name;
	int number;
	String team;
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
	}

}
