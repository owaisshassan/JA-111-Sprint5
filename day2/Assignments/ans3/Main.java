package sprint5Day2AssignmentsQues3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	int totalWages(LocalDate startDate, LocalDate endDate) {
		if(startDate.compareTo(endDate)<0 ) {
			int days=Period.between(startDate,endDate).getDays();
			int years=Period.between(startDate,endDate).getYears();
			int months=Period.between(startDate,endDate).getMonths();
			int total= (years*365)+(months*30)+(days);
			return total*1200;
			
		}else {
			System.out.println("Start date should be smaller than End date");
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start date in 'dd-MM-yyyy' format:");
		String sDate=sc.next();
		System.out.println("Enter End date in 'dd-MM-yyyy' format:");
		String eDate=sc.next();
		
		LocalDate startDate = null;
		LocalDate endDate= null;
		
		try {
			startDate= LocalDate.parse(sDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			endDate= LocalDate.parse(eDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		}catch(DateTimeParseException dpe){
			System.out.println("Please enter date in 'dd-MM-yyyy' format");
		}
		
		Main m=new Main();
		
		if(m.totalWages(startDate, endDate)!=0) {
			System.out.println("Total wages: "+m.totalWages(startDate, endDate));
		}
		
		
		
	}
	
}
