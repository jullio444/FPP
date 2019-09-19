package homework.lesson8.day2.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarketingComparator {

	public static void main(String[] args) {
		ArrayList<Marketing> list = new ArrayList<>();
		list.add(new Marketing("Jullio Jymez", "Nexus 5", 1700));
		list.add(new Marketing("John  Chambers", "Neon 10", 850));
		list.add(new Marketing("Kevin", "Okura L", 1500));
		list.add(new Marketing("Kevin", "Okura L", 1500));
		
		list.remove(3);
		System.out.println("Original Array: ");
		list.forEach(System.out::println);
		
		System.out.println("\nSorted by Sales Amount: ");
		Collections.sort(list, new SalesAmountComparator());
		list.forEach(System.out::println);
		
		System.out.println("\nSorted by Employee Name: ");
		Collections.sort(list, new EmployeeNameComparator());
		list.forEach(System.out::println);
		
		System.out.println("\nMore than 1000 (Sales Amount): ");
		List<Marketing> listFilters = listMoreThan1000(list);
		listFilters.forEach(System.out::println);
	}

	public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		List<Marketing> markets = new ArrayList<Marketing>();
		list.forEach(market -> {
			if (market.getSalesAmount() > 1_000) {
				markets.add(market);
			}
		});
		Collections.sort(markets, new EmployeeNameComparator());
		return markets;
	}
}

/*
 * OUTPUT
 *
 * Original Array: 
 * [Jullio Jymez, Nexus 5, 1700.0]
 * [John  Chambers, Neon 10, 850.0]
 * [Kevin, Okura L, 1500.0]

 * Sorted by Sales Amount: 
 * [John  Chambers, Neon 10, 850.0]
 * [Kevin, Okura L, 1500.0]
 * [Jullio Jymez, Nexus 5, 1700.0]

 * Sorted by Employee Name: 
 * [John  Chambers, Neon 10, 850.0]
 * [Jullio Jymez, Nexus 5, 1700.0]
 * [Kevin, Okura L, 1500.0]

 * More than 1000 (Sales Amount): 
 * [Jullio Jymez, Nexus 5, 1700.0]
 * [Kevin, Okura L, 1500.0]
*/