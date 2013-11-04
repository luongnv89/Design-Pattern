package models;

public class Singleton1b extends Singleton1 {
	private String bAttribute;

	private Singleton1b() {
		super();
		bAttribute = "Singleton 1B";
	}

	public synchronized static Singleton1b instance() throws ClassCastException {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton1b();
		else {
			if (!(uniqueInstance instanceof Singleton1b))
				throw (new ClassCastException(
						"A different Singleton already exists, you cannot create new Singleton!"));
		}
		return (Singleton1b) uniqueInstance;
	}

	public String getbAttribute() {
		return bAttribute;
	}

	public void setbAttribute(String bAttribute) {
		this.bAttribute = bAttribute;
	}

	public String sayHello() {
		return "I am " + bAttribute;
	}

}
