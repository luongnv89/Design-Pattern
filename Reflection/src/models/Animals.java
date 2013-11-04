package models;

/**
 * The animals class
 * 
 * @author crocode
 * 
 */
public abstract class Animals {
	/**
	 * Age of animal
	 */
	int age;
	/**
	 * Name of animal
	 */
	String name;

	/**
	 * @return
	 */
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
