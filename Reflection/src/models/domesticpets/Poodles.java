package models.domesticpets;

/**
 * Poodles extends {@link Dogs}
 * @author crocode
 *
 */
public class Poodles extends Dogs {
	String poodlesAttribute;

	public Poodles() {
		super();
		this.poodlesAttribute = "default Poodle";
	}

	public Poodles(String poodlesAttribute) {
		super();
		this.poodlesAttribute = poodlesAttribute;
	}

	public String getPoodlesAttribute() {
		return poodlesAttribute;
	}

	public void setPoodlesAttribute(String poodlesAttribute) {
		this.poodlesAttribute = poodlesAttribute;
	}

	public void poodlesMethod() {
		System.out.println("This is a method of Poodles ");
	}
}
