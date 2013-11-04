package models;

public class Singleton1a extends Singleton1 {
	private String aAttribute;

	private Singleton1a() {
		super();
		aAttribute = "Singleton 1A";
	}

	public synchronized static Singleton1a instance() throws ClassCastException {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton1a();
		else {
			if (!(uniqueInstance instanceof Singleton1a))
				throw (new ClassCastException(
						"A different Singleton already exists, you cannot create new Singleton!"));
		}
		return (Singleton1a) uniqueInstance;
	}

	public String getaAttribute() {
		return aAttribute;
	}

	public void setaAttribute(String aAttribute) {
		this.aAttribute = aAttribute;
	}

	public String sayHello() {
		return "I am a " + aAttribute;
	}

}
