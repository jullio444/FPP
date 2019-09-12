package homework.lesson5.prob6.A;

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
		return (Object) super.clone();
	}
}