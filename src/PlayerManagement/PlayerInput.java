package PlayerManagement;

import java.util.Scanner;

import Exception.NumberException;

public interface PlayerInput {
	
	public void getUserInput(Scanner input);
	
	public int getNumber();
	
	public String getName();
	
	public void setName(String name);
	
	public String getTeam();
	
	public void setTeam(String team);
	
	public void setSal(String sal);
	
	public void setNumber(int number) throws NumberException; 
	
	public void printInfo();
	
	public String getSal();
	
	public void setPlayerName(Scanner input);
	
	public void setPlayerNum(Scanner input);
	
	public void setPlayerTeam(Scanner input);
	
	public void setPlayerSal(Scanner input);
	
}
