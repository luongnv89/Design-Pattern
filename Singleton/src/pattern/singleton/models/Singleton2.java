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
public class Singleton2 {

	private int data;

	public static final Singleton2 uniqueInstance = new Singleton2();

	private Singleton2() {
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
