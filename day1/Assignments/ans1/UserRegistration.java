package sprint5WeDay1AssignmentsQues1;

import java.util.Scanner;

public class UserRegistration {

	
	void registerUser(String username,String userCountry)throws InvalidCountryException {
		if(userCountry.equals("india")) {
			
			System.out.println("User registration done successfully");
		}else {
			InvalidCountryException ice=new InvalidCountryException("User Outside India cannot be registered");
			
			throw ice;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Enter your country:");
		String country=sc.next();
		
		UserRegistration ur=new UserRegistration();
		
		try {
			ur.registerUser(name.toLowerCase(), country.toLowerCase());
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
			
		}
		
		
	}
}
