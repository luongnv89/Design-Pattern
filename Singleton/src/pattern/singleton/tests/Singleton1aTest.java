/**
 * 
 */
package pattern.singleton.tests;

import org.junit.Before;

import pattern.singleton.models.Singleton1a;

/**
 * Test for class {@link Singleton1a}
 * @author crocode
 * 
 */
public class Singleton1aTest extends Singleton1Test {

	/**
	 * @throws java.lang.Exception
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		singleton1 = Singleton1a.instance();
		singleton12 = Singleton1a.instance();
	}

}
