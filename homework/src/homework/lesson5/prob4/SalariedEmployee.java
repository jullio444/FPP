package homework.lesson5.prob4;

public class SalariedEmployee extends Employee{
	double weeklySalary;
	
	SalariedEmployee(String firstName, String lastName, String socialSecurityNumber){
		super(firstName, lastName,  socialSecurityNumber);
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}
}
