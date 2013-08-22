/**
 * 
 */
package pattern.singleton.tests;

import org.junit.Before;

import pattern.singleton.models.Singleton1a;
import pattern.singleton.models.Singleton1b;

/**
 * Test for class {@link Singleton1a} and {@link Singleton1b}
 * 
 * @author crocode
 * 
 */
public class Singleton1abTest extends Singleton1Test {

	/**
	 * @throws java.lang.Exception
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		singleton12 = Singleton1a.instance();
		singleton1 = Singleton1b.instance();
	}

}
