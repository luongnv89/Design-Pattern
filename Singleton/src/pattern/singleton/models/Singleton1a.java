/**
 * 
 */
package pattern.singleton.models;

/**
 * Subclass of {@link Singleton1}
 * 
 * @author crocode
 * 
 */
public class Singleton1a extends Singleton1 {

	/**
	 * 
	 */
	public Singleton1a() {
		data = 15;
	}

	public synchronized static Singleton1 instance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton1a();
		return uniqueInstance;
	}
}
