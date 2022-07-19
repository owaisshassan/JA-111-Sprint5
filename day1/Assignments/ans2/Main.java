package sprint5WeDay1AssignmentsQues2;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		
		try {
			int num1= sc.nextInt();
			int num2=sc.nextInt();
			
			int res=num1/num2;
			
			System.out.println("The quotient of "+num1+"/"+num2+" = "+ res);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Inside finally block");
		}
		
		
	}
}
