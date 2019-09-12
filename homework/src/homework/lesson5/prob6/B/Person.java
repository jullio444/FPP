package homework.lesson5.prob6.B;

public class Person implements Cloneable {
	String name;
	Computer computer;

	public Person(String name, Computer computer) {
		this.name = name;
		this.computer = computer;
	}

	@Override
	public String toString() {
		return name+"'s Computer Details->"+computer.toString();
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.computer = (Computer) computer.clone();
		return p;
	}
}