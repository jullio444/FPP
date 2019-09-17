package homework.lesson8.prob2;

public class PersonList {
	private final int INITIAL_LENGTH = 6;
	private Person[] person;
	private int size;

	PersonList() {
		person = new Person[INITIAL_LENGTH];
		size = 0;
	}

	public void add(Person p) {
		if (size == person.length)
			resize();
		person[size++] = p;
	}

	public Person get(int i) {
		if (i < 0 || i >= size)
			return null;
		return person[i];
	}

	public boolean find(Person pp) {
		for (Person p : person) {
			if (p.equals(pp))
				return true;
		}
		return false;
	}

	public void insert(Person p, int pos) {
		if (pos > size)
			return;
		if (pos >= person.length || size + 1 > person.length) {
			resize();
		}
		Person[] temp = new Person[person.length + 1];
		System.arraycopy(person, 0, temp, 0, pos);
		temp[pos] = p;

		System.arraycopy(person, pos, temp, pos + 1, person.length - pos);
		person = temp;
		++size;

	}

	public boolean remove(Person p) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (person[i].equals(p)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		Person[] temp = new Person[person.length];
		System.arraycopy(person, 0, temp, 0, index);
		System.arraycopy(person, index + 1, temp, index, person.length - (index + 1));
		person = temp;
		--size;
		return true;
	}

	public void resize() {
		Person[] temp = new Person[1 + person.length];
		System.arraycopy(person, 0, temp, 0, person.length);
		person = temp;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			builder.append(person[i] + ", \n");
		}
		builder.append(person[size - 1] + "]");
		return builder.toString();
	}

	public int size() {
		return size;
	}
}
