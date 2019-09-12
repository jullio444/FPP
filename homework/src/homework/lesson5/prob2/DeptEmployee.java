package homework.lesson5.prob2;

import java.time.LocalDate;

public class DeptEmployee {

	protected String name;
	protected double Salary = 0.0;
	protected LocalDate hiredate;

	DeptEmployee(String name, double Salary, LocalDate hiredate) {
		this.name = name;
		this.Salary = Salary;
		this.hiredate = hiredate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return hiredate;
	}

	public void setDate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	
	public double computeSalary() {
		return Salary;
	}
}
