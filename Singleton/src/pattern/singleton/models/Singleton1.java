/**
 * 
 */
package pattern.singleton.models;

/**
 * See - http://sourcemaking.com/design_patterns/singleton <li>Intent: <br>
 * Ensure a class has only one instance, and provide a global point of access to
 * it. <br>
 * Encapsulated “just-in-time initialization” or “initialization on first use”.
 * <li>
 * Problem <br>
 * Application needs one, and only one, instance of an object. <br>
 * Additionally, lazy initialization and global access are necessary
 * 
 * @author crocode
 * 
 */
public class Singleton1 {
	protected static Singleton1 uniqueInstance = null;

	protected int data;

	public synchronized static Singleton1 instance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton1();
		return uniqueInstance;
	}

	protected Singleton1() {
		data = 0;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

}
