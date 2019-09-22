package homework.lesson11.prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null) {
			return false;
		}
		if(o.getClass()!=Key.class) {
			return false;
		}
		Key k = (Key) o;
		if(this.firstName.equals(k.firstName)&&this.lastName.equals(k.lastName)) {
			return true;
		}
		
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.getFirstName(), this.getLastName());
	}
	@Override
	public String toString() {
		return "Key [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
