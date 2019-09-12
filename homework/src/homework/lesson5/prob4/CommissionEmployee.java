package homework.lesson5.prob4;

public class CommissionEmployee extends Employee{
	double grossSales;
	double commissionRate;
	
	CommissionEmployee(String firstName, String lastName, String socialSecurityNumber){
		super(firstName, lastName,  socialSecurityNumber);
	}
	
	@Override
	public  double getPayment() {
		return grossSales*commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
}
