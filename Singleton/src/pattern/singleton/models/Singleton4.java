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
public class Singleton4 {
	private int data;

	private Singleton4() {
		data = 0;
	}

	private static class SingletonHolder {
		private static final Singleton4 INSTANCE = new Singleton4();
	}

	public static Singleton4 getInstance() {
		return SingletonHolder.INSTANCE;
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
