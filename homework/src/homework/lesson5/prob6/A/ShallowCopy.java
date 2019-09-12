package homework.lesson5.prob6.A;

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Computer computer = new Computer("Apple", "i5", 16, 3.8);
		Person p1 = new Person("Julius", computer);
		Person p2 = (Person) p1.clone();

		System.out.println("Is P1 equal to cloned P1:"+p1.equals(p2)+"\n");

		System.out.println(p1.toString()+"\n");
		System.out.println(p2.toString()+"\n");
		
		p1.computer.manufacturer = "Acer";
		
		System.out.println("Changing value like Manufacturer in one will reflect in the clone as well"
				+ "\n--------------------------------------------------------------------------");
		p2.computer.manufacturer = "Acer";
		System.out.println(p1.toString()+"\n");
		System.out.println(p2.toString());
	}
}
/*Sample Output
Is P1 equal to cloned P1:false

Julius's Computer Details->
Manufacturer:Apple
Processor:i5
Ram:16
ProcessorSpeed:3.8

Julius's Computer Details->
Manufacturer:Apple
Processor:i5
Ram:16
ProcessorSpeed:3.8

Changing value like Manufacturer in one will reflect in the clone as well
--------------------------------------------------------------------------
Julius's Computer Details->
Manufacturer:Acer
Processor:i5
Ram:16
ProcessorSpeed:3.8

Julius's Computer Details->
Manufacturer:Acer
Processor:i5
Ram:16
ProcessorSpeed:3.8*/