package homework.lesson5.prob4;

public abstract class Employee {
	 protected String firstName;
	 protected String lastName;
	 protected String socialSecurityNumber;	
	 
	 Employee(String firstName, String lastName, String socialSecurityNumber){
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.socialSecurityNumber = socialSecurityNumber;
	 }
	 
	 public abstract double getPayment();
	 
		public String toString() {
			return "Salary for " + firstName +" "+ lastName + " is: " + getPayment();
		}
}
