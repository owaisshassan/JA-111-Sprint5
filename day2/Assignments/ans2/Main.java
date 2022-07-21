package sprint5Day2AssignmentsQues2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import sprint5Day2AssignmentsQues1.InvalidAgeException;

public class Main {

	public int calculateAge(LocalDate dob){  
	//creating an instance of the LocalDate class and invoking the now() method      
	//now() method obtains the current date from the system clock in the default time zone      
	LocalDate curDate = LocalDate.now();  
	//calculates the amount of time between two dates and returns the years  
		if (curDate.getYear()>dob.getYear()){  
		return Period.between(dob, curDate).getYears();  
		}else {  
			System.out.println("Date should not be in Future");
			
		}
		return 0;
		
		
	}
	
	
	public static void main(String[] args)throws InvalidDateFormat {
		
		

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter joining date in 'dd-MM-yyyy' format: ");
		String input=sc.next();
		LocalDate dob;
		try {
			 dob= LocalDate.parse(input,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
		}catch(DateTimeParseException dtpe){
			throw new InvalidDateFormat("please enter valid format");
		}
		
			//prints the age  
		Main m=new Main();
		 if(m.calculateAge(dob)!=0) {
			 System.out.println("You are " + m.calculateAge(dob)+" years old");
		 }
		
		
		
		
		
	}
}
