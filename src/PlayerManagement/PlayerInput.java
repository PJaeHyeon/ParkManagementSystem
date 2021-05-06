package PlayerManagement;

import java.util.Scanner;

public interface PlayerInput {
	
	public void getUserInput(Scanner input);
	
	public int getNumber();
	
	public void setName(String name);
	
	public void setTeam(String team);
	
	public void setSal(String sal);
	
	public void setNumber(int number);
	
	public void printInfo();
	
	public String getSal();

}
