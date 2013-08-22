/**
 * 
 */
package pattern.singleton.tests;

import org.junit.Before;
import org.junit.Test;

import pattern.singleton.models.Singleton2;

/**
 * Test for class {@link Singleton2}
 * 
 * @author crocode
 * 
 */
public class Singleton2Test {

	Singleton2 singleton2;
	Singleton2 singleton22;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		singleton2 = Singleton2.uniqueInstance;
		singleton22 = Singleton2.uniqueInstance;
	}

	/**
	 * Test method for {@link pattern.singleton.models.Singleton2#getData()}.
	 */
	@Test
	public void testGetData() {
		System.out.println("Singleton 1: " + singleton2.getData());
		System.out.println("Singleton 2: " + singleton22.getData());
	}

	/**
	 * Test method for {@link pattern.singleton.models.Singleton2#setData(int)}.
	 */
	@Test
	public void testSetData() {
		singleton2.setData(10);
		System.out.println("Singleton 1: " + singleton2.getData());
		System.out.println("Singleton 2: " + singleton22.getData());
		singleton22.setData(20);
		System.out.println("Singleton 1: " + singleton2.getData());
		System.out.println("Singleton 2: " + singleton22.getData());
	}

}
