package wildCard;

public class Person {

	String name;
	
	public Person() {	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
