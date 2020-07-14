package ec.edu.epn.git;

public class Persona {
	private int age;
	private String name;
	private String city;
	
	public Persona(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
