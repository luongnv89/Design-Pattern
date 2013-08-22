/**
 * 
 */
package pattern.singleton.models;

/**
 * See {@link Singleton1}
 * 
 * @author crocode
 * 
 */
public class Singleton3 {
	private int data;

	private static final Singleton3 uniqueInstance = new Singleton3();

	private Singleton3() {
		data = 0;
	}

	public static Singleton3 instance() {
		return uniqueInstance;
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
