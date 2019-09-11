package Streamjava;

public class Employename {
	private final String name;
	private final Gender gender;
	private final int age;

	public Employename(String name, Gender gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return String.format("Employename [name=%s, gender=%s, age=%s]", name, gender, age);
	}

	public int getAge() {
		return age;
	}

}
