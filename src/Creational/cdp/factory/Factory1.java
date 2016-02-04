package Creational.cdp.factory;

public class Factory1 {
	public static void main(String args[]) {
		Factory1 factory = new Factory1();
		factory.getPerson(args[0], args[1]);
	}

	public Person getPerson(String name, String gender) {
		if (gender.equals("M"))
			return new Male(name);
		else if (gender.equals("F"))
			return new Female(name);
		else
			return null;
	}
}

class Person {
	public String name;
	private String gender;

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}
}

class Male extends Person {
	public Male(String fullName) {
		System.out.println("Hello Mr. " + fullName);
	}
}

class Female extends Person {
	public Female(String fullNname) {
		System.out.println("Hello Ms. " + fullNname);
	}
}