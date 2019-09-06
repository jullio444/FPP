package homework.lesson3.prob1;


public class Prob1Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1 = new Address("252 Lake View Rd", "Chicago", "Iowa", "37363");
		Address add2 = new Address("8073 Elizabeth Drive", "Fairfild", "Iowa", "18052");
		Address add3 = new Address("Clove Ave", "Montreal", "Iowa", "18052");

		Customer[] c = new Customer[3];
		
		c[0] = new Customer("John", "Musoke", "4673");
		c[1] = new Customer("Peter", "Musa", "5784");
		c[2] = new Customer("Edna", "Torana", "5893");
		
		//set billing address	
		c[0].setBillingAddress(add1);
		c[0].setShippingAddress(add2);
		
		c[1].setBillingAddress(add2);
		c[1].setShippingAddress(add2);
		
		c[2].setBillingAddress(add1);
		c[2].setShippingAddress(add3);
		
		for(Customer j: c) {
			if(j.getBillingAddress().getCity().equals("Chicago")) {
				System.out.println(j);
			}
		}

		
	}

}
/*
 * Sample Output
 *
 * [John, Musoke, ssn: 4673] 
 * [Edna, Torana, ssn: 5893]
 */