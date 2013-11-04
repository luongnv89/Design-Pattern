package models.domesticpets;

/**
 * Spaniels extends {@link Dogs}
 * 
 * @author crocode
 * 
 */
public class Spaniels extends Dogs {

	String spanielAttribute;

	public Spaniels() {
		super();
		this.spanielAttribute = "default spaniels";
	}

	public Spaniels(String spanielAttribute) {
		super();
		this.spanielAttribute = spanielAttribute;
	}

	public String getSpanielAttribute() {
		return spanielAttribute;
	}

	public void setSpanielAttribute(String spanielAttribute) {
		this.spanielAttribute = spanielAttribute;
	}

	public void spanielMethod() {
		System.out.println("This is spaniel method!");
	}
}
