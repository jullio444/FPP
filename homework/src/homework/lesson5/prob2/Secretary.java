package homework.lesson5.prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
	private double overtimeHours;
	
	Secretary(String name, double Salary, LocalDate hiredate, double overtimeHours){
		super(name, Salary, hiredate);
		this.overtimeHours = overtimeHours;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary() {
		System.out.println(Salary + 12 * overtimeHours);
		return Salary + 12 * overtimeHours;
	}
	
}
