package homework.lesson11.prob2;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input list
	 * socSecNums and whose salary is > 80000. The list must be ordered by social
	 * security number, from lowest to highest. To sort, you must use a Collections
	 * sorting method and you must define your own Comparator to be used to compare
	 * Employees by ssn.
	 */
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {

		List<Employee> temp = new LinkedList<>();

		for (int i = 0; i < socSecNums.size(); i++) {
			if (table.containsKey(socSecNums.get(i))) {
				if (table.get(socSecNums.get(i)).getSalary() > 80000)
					temp.add(table.get(socSecNums.get(i)));
			}
		}

		Collections.sort(temp, (e1, e2) -> {
			return e1.getSsn().compareTo(e2.getSsn());

		});

		return temp;

	}

}
