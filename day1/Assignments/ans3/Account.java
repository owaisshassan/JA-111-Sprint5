package sprint5WeDay1AssignmentsQues3;

public class Account {

	String accountNumber;
	double balance=2000;
	Account(String accountNumber){
		System.out.println("Acoount nnumber: "+accountNumber);
	}
	void deposit(int amount) {
		System.out.println("Total balance: "+(balance+amount));
	}
	double withdraw(int amount) throws InsufficientFundsException {
		double balanceLeft=0;
		if(amount<balance) {
			balanceLeft=balance-amount;
					
		}else {
			throw new InsufficientFundsException();
		}
		return balanceLeft;	
		
	}
}
