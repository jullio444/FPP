package homework.lesson5.prob4;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommissionEmployee commissionEmp = new CommissionEmployee("John", "Mikel", "WRT123");
		BasePlusCommisionEmployee basePlus = new BasePlusCommisionEmployee("Kel", "Bosty", "WRT156");
		HourlyEmployee hourlyEmp = new HourlyEmployee("John", "Mikel", "WRT762");
		SalariedEmployee salaryEmp = new SalariedEmployee("Joan", "Simpson", "WRT471");
		SalariedEmployee salaryEmp2 = new SalariedEmployee("Jesca", "Prossy", "WRT564");
		
		commissionEmp.setCommissionRate(300);
		commissionEmp.setGrossSales(32);
		
		basePlus.setBaseSalary(950);
		basePlus.setCommissionRate(25);
		basePlus.setGrossSales(520);
		
		hourlyEmp.setHours(34);
		hourlyEmp.setWage(1200);
		
		salaryEmp.setWeeklySalary(5000);
		salaryEmp2.setWeeklySalary(6500);
		
		Employee[] emp = {commissionEmp, basePlus, hourlyEmp,salaryEmp, salaryEmp2};
		
		double totalSalary = 0.0;
		
		for(Employee e: emp) {
			totalSalary+= e.getPayment();
			System.out.println(e.toString());
		}
		System.out.println("\nTotal Salary: " + totalSalary);
	}

}
/*Sample Output

Salary for John Mikel is: 9600.0
Salary for Kel Bosty is: 13950.0
Salary for John Mikel is: 40800.0
Salary for Joan Simpson is: 5000.0
Salary for Jesca Prossy is: 6500.0

Total Salary: 75850.0*/
