package homework.lesson5.prob4;

public class BasePlusCommisionEmployee extends CommissionEmployee{
	double baseSalary;
	
	BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber){
		super(firstName, lastName, socialSecurityNumber);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return baseSalary + (grossSales * super.commissionRate);
	}
}
