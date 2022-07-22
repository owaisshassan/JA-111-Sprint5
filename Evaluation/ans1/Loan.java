package sprint5EvaluationQues1;

public class Loan {

	
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee) {
			 PermanentEmployee pe= new PermanentEmployee();
			pe.calculateSalary();
			double res= (15/100)*pe.salary;
			return res;
		}else if(employeeObj instanceof TemporaryEmployee) {
			TemporaryEmployee te= new TemporaryEmployee();
			te.calculateSalary();
			double res2= (10/1000)*te.salary;
		}
		return 0.0;
	}
	
	
	Loan() {
		
	}
	
	public Loan factory() {
		 return new Loan();
	}
	
}
