package models.domesticpets;

import models.DomesticPets;

/**
 * Dogs class extends {@link DomesticPets}
 * @author crocode
 *
 */
public class Dogs extends DomesticPets {

	/**
	 * The id of dogs
	 */
	String lineName;

	public Dogs() {
		super();
		this.lineName = "default line";
	}

	public Dogs(String lineName) {
		super();
		this.lineName = lineName;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	@Override
	public void sayHello() {
		System.out.println("Go go go go go go!");
	}
}
