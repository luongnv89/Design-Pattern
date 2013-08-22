/**
 * 
 */
package pattern.singleton.tests;

import org.junit.Before;

import pattern.singleton.models.Singleton1b;

/**
 * Test for class {@link Singleton1b}
 * @author crocode
 * 
 */
public class Singleton1bTest extends Singleton1Test {

	/**
	 * @throws java.lang.Exception
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		singleton1 = Singleton1b.instance();
		singleton12 = Singleton1b.instance();
	}

}
