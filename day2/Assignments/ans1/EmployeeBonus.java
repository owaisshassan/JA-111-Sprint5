package sprint5Day2AssignmentsQues1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import sprint5Day2LocalDateTime.LocalDate1;

public class EmployeeBonus {
	
	double getBonus(LocalDate joiningDate) throws InvalidAgeException{
		LocalDate ld2= LocalDate.now();
		
		Period p = Period.between(joiningDate, ld2);
		if(p.getYears()<0) {
			throw new InvalidAgeException("Age should not be in the future");
		}else if(p.getYears()<1) {
			return 5000;
		}else if(p.getYears()==1 || p.getYears()<2) {
			return 8000;
		}else if(p.getYears()>2) {
			return 10000;
		}
		return 0;
	}
	
	
	public static void main(String[] args) throws InvalidAgeException {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter joining date in 'dd-MM-yyyy' format: ");
		String jDate=sc.next();
		LocalDate ld;
		try {
			 ld= LocalDate.parse(jDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
		}catch(DateTimeParseException dtpe){
			throw new InvalidAgeException("please enter valid format");
		}
		
		
		
		EmployeeBonus eb= new EmployeeBonus();
		System.out.println("Employee Bonus is "+eb.getBonus(ld));
		
		
		
		
		
		
		
		
		
	}

	

}
