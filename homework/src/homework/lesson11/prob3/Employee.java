package homework.lesson11.prob3;

import java.util.Objects;

/** NOTE: You must override equals in this class */
public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}	
	@Override
	public boolean equals(Object ob) {
		if(ob==null) return false;
		if(ob.getClass()!=this.getClass()) return false;
		Employee ee = (Employee) ob;
		return this.getName().equals(ee.getName()) && this.getSalary()==ee.getSalary();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
}
