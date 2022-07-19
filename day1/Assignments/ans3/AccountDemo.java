package sprint5WeDay1AssignmentsQues3;

import java.util.Scanner;

public class AccountDemo {
	
	

	
	public static void main(String[] args){
		
		Account a=new Account("12431231sdf");
		

		
		System.out.println("Enter amount :");
		try {
			
			Scanner sc=new Scanner(System.in);
		
			int amount=sc.nextInt();
			if(a.balance==0) {
				a.deposit(amount);
			}
			System.out.println("Balance Left: "+a.withdraw(amount));
		} catch (InsufficientFundsException e) {
			e=new InsufficientFundsException("Insufficient Balance");
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("End of main");
	}
}
