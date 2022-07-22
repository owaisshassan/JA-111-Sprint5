package sprint5EvaluationQues2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;




public class Main {

	
	
	public static void main(String[] args) throws DateTimeParseException {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter date of birth in 'dd-MM-yyyy' format: ");
		String dateofB=sc.next();
		LocalDate dob=LocalDate.now();
		try {
			 dob= LocalDate.parse(dateofB,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
		}catch(DateTimeParseException dtpe){
			dtpe= new DateTimeParseException("please pass the date in the proper format", dateofB, 0);
		}
		
		LocalDate ld= LocalDate.now();
		Period p = Period.between(dob, ld);
		if(p.getYears()<0) {
			System.out.println("Date of birth should not be in future");
		}
		else if(p.getYears()>=18) {
			System.out.println("You are eligible to cast your vote");
		}else if(p.getYears()==0 && p.getMonths()==0 && p.getDays()==0) {
			System.out.println("Happy Birthday, You are eligible to cast your vote");
		}
		
		
		
		
		
	}
}
