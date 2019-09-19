package homework.lesson8.prob2;

import java.util.Objects;

public class Person {

	private String lastName;
	private String firstName;
	private int age;

	// --------------------------------------------------------------
	public Person(String last, String first, int a) { // constructor
		lastName = last;
		firstName = first;
		age = a;
	}

	// --------------------------------------------------------------
	public String getLast() { // get last name
		return lastName;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + " FirstName=" + firstName + " Age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person person = (Person) obj;
		return lastName.equals(person.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lastName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonList personList = new PersonList();
		personList.add(new Person("Chris", "Evans", 38));
		personList.add(new Person("Bobi", "Wine", 37));
		personList.add(new Person("John", "Blaq", 23));
		personList.add(new Person("King", "Saha", 29));

		System.out.println("The list of size: " + personList.size() + " is \n" + personList + "\n");

		Person steveJob = personList.get(1);
		personList.remove(steveJob);

		System.out.println("The list of size: " + personList.size() + " is \n" + personList + "\n");

		personList.insert(new Person("Kennedy", "Polsky", 65), 0);
		System.out.println("The list of size: " + personList.size() + " is \n" + personList + "\n");

		personList.insert(new Person("Barack", "Obama", 58), 4);
		System.out.println("The list of size: " + personList.size() + " is \n" + personList + "\n");

	}

} // end class Person

/* OUTPUT
 * 
 * The list of size: 4 is 
 * [Person [lastName=Chris FirstName=Evans Age=38],
 * Person [lastName=Bobi FirstName=Wine Age=37], 
 * Person [lastName=John FirstName=Blaq Age=23], 
 * Person [lastName=King FirstName=Saha Age=29]]
 * 
 * The list of size: 3 is 
 * [Person [lastName=Chris FirstName=Evans Age=38], 
 * Person [lastName=John FirstName=Blaq Age=23], 
 * Person [lastName=King FirstName=Saha Age=29]]
 * 
 * The list of size: 4 is 
 * [Person [lastName=Kennedy FirstName=Polsky Age=65], 
 * Person [lastName=Chris FirstName=Evans Age=38], 
 * Person [lastName=John FirstName=Blaq Age=23], 
 * Person [lastName=King FirstName=Saha Age=29]]
 * 
 * The list of size: 5 is 
 * [Person [lastName=Kennedy FirstName=Polsky Age=65], 
 * Person [lastName=Chris FirstName=Evans Age=38], 
 * Person [lastName=John FirstName=Blaq Age=23], 
 * Person [lastName=King FirstName=Saha Age=29], 
 * Person [lastName=Barack FirstName=Obama Age=47]]
 */
