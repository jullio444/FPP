package homework.lesson8.day2.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Marketing {
	private String employeename;
	private String productname;
	private double salesamount;

	public Marketing(String employeename, String productname, double salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	@Override
	public String toString() {
		return "[" + employeename + ", " + productname + ", " + salesamount + "]";
	}

	@Override
	public boolean equals(Object object) {
		if (object == null)
			return false;
		if (!(object instanceof Marketing))
			return false;
		Marketing other = (Marketing) object;
		return other.getEmployeeName().equals(employeename)
				&& other.getProductName().equals(productname)
				&& other.getSalesAmount() == salesamount;
	}

	public Object hasCode() {
		return Objects.hash(employeename, productname, salesamount);
	}

	public double getSalesAmount() {
		return salesamount;
	}

	public String getEmployeeName() {
		return employeename;
	}

	public String getProductName() {
		return productname;
	}
	 public static ArrayList<Marketing> greaterThan1000(ArrayList<Marketing> am){
		ArrayList<Marketing> amDupe = new ArrayList<Marketing>();
		for(Marketing m: am) {
			if(m.getSalesAmount()>1000) {
				amDupe.add(m);
			}
		}
		return amDupe;
	}
	public static void main(String[] args) {
		ArrayList<Marketing> m = new ArrayList<Marketing>();
		m.add(new Marketing("Jullio Jymez", "Apple", 7500));
		m.add(new Marketing("Kevin Heart", "Apple", 800));
		m.add(new Marketing("King Saha", "Dell", 1600));
		m.add(new Marketing("Mike Luda", "Dell", 1200));
		
		Collections.sort(m, (e1, e2) -> {
			return ((Double)e1.getSalesAmount()).compareTo(e2.getSalesAmount());
		});
		System.out.println("Sorted by Sales amount");
		m.forEach(System.out::println);
		System.out.println();
		
		ArrayList<Marketing> greater = new ArrayList<Marketing>();
		greater = greaterThan1000(m);
		Collections.sort(greater, (e1,e2)->{
			return e1.getEmployeeName().compareTo(e2.getEmployeeName());
		});
		
		System.out.println("Sorted by Name with the criteria of the employee who achieves more than $1000");
		greater.forEach(System.out::println);
	}
}
/*
 * OUTPPUT
 * Sorted by Sales amount
 * [Kevin Heart, Apple, 800.0]
 * [Mike Luda, Dell, 1200.0]
 * [King Saha, Dell, 1600.0]
 * [Jullio Jymez, Apple, 7500.0]
 *
 * Sorted by Name with the criteria of the employee who achieves more than $1000
 * [Jullio Jymez, Apple, 7500.0]
 * [King Saha, Dell, 1600.0]
 * [Mike Luda, Dell, 1200.0]
 *
 * 
*/
