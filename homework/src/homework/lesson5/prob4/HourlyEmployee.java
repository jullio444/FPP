package homework.lesson5.prob4;

public class HourlyEmployee extends Employee{
	double wage;
	double hours;
	
	
	HourlyEmployee(String firstName, String lastName, String socialSecurityNumber){
		super(firstName, lastName,  socialSecurityNumber);
	}
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return wage*hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
}
