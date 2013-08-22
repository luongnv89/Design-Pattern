/**
 * 
 */
package pattern.singleton.tests;

import org.junit.Before;
import org.junit.Test;

import pattern.singleton.models.Singleton3;

/**
 * Test for class {@link Singleton3}
 * 
 * @author crocode
 * 
 */
public class Singleton3Test {
	Singleton3 singleton3;
	Singleton3 singleton32;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		singleton3 = Singleton3.instance();
		singleton32 = Singleton3.instance();
	}

	/**
	 * Test method for {@link pattern.singleton.models.Singleton3#getData()}.
	 */
	@Test
	public void testGetData() {
		System.out.println("Singleton3: " + singleton3.getData());
		System.out.println("Singleton2: " + singleton32.getData());
	}

	/**
	 * Test method for {@link pattern.singleton.models.Singleton3#setData(int)}.
	 */
	@Test
	public void testSetData() {
		singleton3.setData(10);
		System.out.println("Singleton3: " + singleton3.getData());
		System.out.println("Singleton2: " + singleton32.getData());
		singleton32.setData(20);
		System.out.println("Singleton3: " + singleton3.getData());
		System.out.println("Singleton2: " + singleton32.getData());
	}

}
