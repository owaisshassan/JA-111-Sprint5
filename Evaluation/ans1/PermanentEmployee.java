package sprint5EvaluationQues1;

public class PermanentEmployee extends Employee{

	

	private double basicPay;
	
	public PermanentEmployee() {
		
	}
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay= basicPay;
		
	}
	






	@Override
	public void calculateSalary() {
		double PFamount= basicPay*0.12;
		double salary= basicPay- PFamount;
		
	}
	
	
}
