package homework.lesson5.prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class TestDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeptEmployee[] emp = {new Professor("Dr. John Quin", 120000.5, LocalDate.of(2013, 9, 27), 10),
				new Professor("Dr. Paul Bagenda", 138000.5, LocalDate.of(2012, 5, 16), 15),
				new Professor("Prof. Charles Hallowings", 159600.85, LocalDate.of(2012, 9, 27), 27),
				new Secretary("Roren Clop", 68500.5, LocalDate.of(2012, 2, 7), 16.8),
				new Secretary("Chris Mastr", 62500.25, LocalDate.of(2014, 4, 18), 58.2)
				
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you wish to see the sum of all Professor \n"
				+ "and Secretary salary in the department? Y/N" );
		String checkResponse = scan.nextLine();
		switch(checkResponse.toUpperCase()) {
		case "Y" :
			double salarySum = 0.0;
			for(DeptEmployee d: emp) {
				salarySum+= d.computeSalary();
			}
			System.out.printf("Total sum of salaries of all employees is: %f", salarySum);
			break;
		case "N":
			System.out.println("Thank you");
			scan.close();
			break;
		default:
			System.out.println("Invalid Input");
			scan.close();
		}
	}

}
/*Sample Output

Do you wish to see the sum of all Professor 
and Secretary salary in the department? Y/N
y
68702.1
63198.65
Total sum of salaries of all employees is: 549502.600000 */