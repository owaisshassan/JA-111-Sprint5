package sprint5EvaluationQues1;

public class TemporaryEmployee extends Employee{

	private int hoursWorked;
	private int hoursWages;
	
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked,int hoursWages) {
		super(employeeId, employeeName);
		this.hoursWorked=hoursWorked;
		this.hoursWages=hoursWages;
		
	}
	public TemporaryEmployee() {
		
	}
	
	@Override
	public void calculateSalary() {
		double salary= hoursWorked*hoursWages;
		
	}
	
	
	
}
