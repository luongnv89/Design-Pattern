/**
 * 
 */
package pattern.singleton.tests;

import org.junit.Before;
import org.junit.Test;

import pattern.singleton.models.Singleton4;

/**
 * Test for class {@link Singleton4}
 * 
 * @author crocode
 * 
 */
public class Singleton4Test {
	Singleton4 singleton4;
	Singleton4 singleton42;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		singleton4 = Singleton4.getInstance();
		singleton42 = Singleton4.getInstance();
	}

	/**
	 * Test method for {@link pattern.singleton.models.Singleton4#getData()}.
	 */
	@Test
	public void testGetData() {
		System.out.println("Singleton4: " + singleton4.getData());
		System.out.println("Singleton2: " + singleton42.getData());
	}

	/**
	 * Test method for {@link pattern.singleton.models.Singleton4#setData(int)}.
	 */
	@Test
	public void testSetData() {
		singleton4.setData(10);
		System.out.println("Singleton4: " + singleton4.getData());
		System.out.println("Singleton2: " + singleton42.getData());
		singleton42.setData(20);
		System.out.println("Singleton4: " + singleton4.getData());
		System.out.println("Singleton2: " + singleton42.getData());
	}

}
