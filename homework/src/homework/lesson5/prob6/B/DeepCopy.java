package homework.lesson5.prob6.B;

public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer cp = new Computer("Apple", "i7", 32, 4.2);
		Person p1 = new Person("Nachiket Sant", cp);
		Person p2 = null;
		try {
		p2 = (Person)p1.clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Is P1 equal to cloned P1: "+p1.equals(p2)+"\n");
		System.out.println(p1.toString()+"\n");
		System.out.println(p2.toString()+"\n");
		
		System.out.println("Changing value like Manufacturer in one won't reflect in the clone"
				+ "\n--------------------------------------------------------------------------");
		p2.computer.manufacturer = "Acer";
		System.out.println(p1.toString()+"\n");
		System.out.println(p2.toString());
		
	}

}
/*SAMPLE OUTPUT
Is P1 equal to cloned P1: false

Nachiket Sant's Computer Details->
Manufacturer:Apple
Processor:i7
Ram:32
ProcessorSpeed:4.2

Nachiket Sant's Computer Details->
Manufacturer:Apple
Processor:i7
Ram:32
ProcessorSpeed:4.2

Changing value like Manufacturer in one won't reflect in the clone
--------------------------------------------------------------------------
Nachiket Sant's Computer Details->
Manufacturer:Apple
Processor:i7
Ram:32
ProcessorSpeed:4.2

Nachiket Sant's Computer Details->
Manufacturer:Acer
Processor:i7
Ram:32
ProcessorSpeed:4.2*/