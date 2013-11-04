package models.domesticpets;

import models.DomesticPets;

/**
 * Cats class extends {@link DomesticPets}
 * @author crocode
 *
 */
public class Cats extends DomesticPets {
	String catAttribute;

	public Cats() {
		super();
		this.catAttribute="Default cat";
	}

	public Cats(String catAttribute) {
		super();
		this.catAttribute = catAttribute;
	}

	public String getCatAttribute() {
		return catAttribute;
	}

	public void setCatAttribute(String catAttribute) {
		this.catAttribute = catAttribute;
	}

	@Override
	public void sayHello() {
		System.out.println("Meo meo meo");
	}

}
