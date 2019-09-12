package homework.lesson5.prob2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
	private int numberOfPublications;
	
	Professor(String name, double Salary, LocalDate hiredate, int numberOfPublications){
		super(name, Salary, hiredate);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
