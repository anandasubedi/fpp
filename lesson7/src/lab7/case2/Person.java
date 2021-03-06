package lab7.case2;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;

	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}

	public String getName() {
		return name;
	}

	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar) dateOfBirth.clone();
	}

	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (!(ob instanceof Person))
			return false;
		Person p = (Person) ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}

	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}

	public static void main(String[] args) {

		GregorianCalendar dateOfBirth = new GregorianCalendar(1991, 04, 28);

		PersonWithJob p = new PersonWithJob("Ananda", dateOfBirth, 2000);
		PersonWithJob p1 = new PersonWithJob("Ananda", new GregorianCalendar(
				1991, 04, 28), 2000);
		System.out.println(p.equals(p1));
	}

}
