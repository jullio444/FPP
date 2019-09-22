package homework.lesson11.prob1;
import java.util.HashMap;
import java.util.List;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key,Student> hm = new HashMap<>();
		for(Student s: students) {
			hm.put(new Key(s.getFirstName(),s.getLastName()), s);
		}
		return hm;
	}
}
