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
public class Singleton1b extends Singleton1 {

	/**
	 * 
	 */
	public Singleton1b() {
		data = 25;
	}

	public synchronized static Singleton1 instance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton1b();
		return uniqueInstance;
	}

}
