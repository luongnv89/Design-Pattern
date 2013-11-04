package models;

/**
 * The domestic pet extend {@link Animals class}
 * 
 * @author crocode
 * 
 */
public abstract class DomesticPets extends Animals {
	/**
	 * The owner of pet
	 */
	String owner;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public abstract void sayHello();

}
