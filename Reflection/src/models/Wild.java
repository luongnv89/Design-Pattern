package models;

/**
 * The wild extend {@link Animals}
 * @author crocode
 *
 */
public abstract class Wild extends Animals{
	/**
	 * The name of forest where the animal lives
	 */
	String forest;

	public String getForest() {
		return forest;
	}

	public void setForest(String forest) {
		this.forest = forest;
	}
	
	
}
