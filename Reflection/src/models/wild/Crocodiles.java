package models.wild;

import models.Wild;

/**
 * Crocodiles extends {@link Wild}
 * 
 * @author crocode
 * 
 */
public class Crocodiles extends Wild {
	String lake;

	public Crocodiles(String lake) {
		super();
		this.lake = lake;
	}

	public String getLake() {
		return lake;
	}

	public void setLake(String lake) {
		this.lake = lake;
	}

	public void croMethod() {
		System.out.println("This is a method of Crocodiles");
	}
}
