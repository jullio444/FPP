package homework.lesson11.prob3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import homework.lesson11.prob3.util.Util;; 

public class EmployeeInfo {
	
	/**
	 * Removes from a copy of the input list all duplicate Employees,
	 * and then returns this list.
	 * 
	 * An Employee instance is considered to be a duplicate of another Employee
	 * instance if the two instances have the same name and salary.
	 */
	public static List<Employee> removeDuplicates(List<Employee> employees) {
		//IMPLEMENT
		List<Employee> l1 = new ArrayList<>();

		Iterator<Employee> it = employees.iterator();
		while(it.hasNext()) {
			Employee e1 = it.next();
			if(!l1.contains(e1)) {
				l1.add(e1);
			}
		}
 		return l1;
	}
	

	//DO NOT MODIFY
	/**
	 * Use the main method to test your solution
	 */
	public static void main(String[] args) {	
		List<Employee> myDupsRemoved = removeDuplicates(TestData.originalList);
		boolean dupsCorrectlyRemoved = Util.listsAreEqual(TestData.dupsRemoved, myDupsRemoved);
		System.out.println("Is answer correct? " + dupsCorrectlyRemoved);
	}
	
	

	 
}
