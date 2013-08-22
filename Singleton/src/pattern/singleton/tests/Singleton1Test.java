/**
 * 
 */
package pattern.singleton.tests;

import org.junit.Before;
import org.junit.Test;

import pattern.singleton.models.Singleton1;

/**
 * Test for class {@link Singleton1}
 * 
 * @author crocode
 * 
 */
public class Singleton1Test {
	Singleton1 singleton1;
	Singleton1 singleton12;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		singleton1 = Singleton1.instance();
		singleton12 = Singleton1.instance();
	}

	/**
	 * Test method for {@link pattern.singleton.models.Singleton1#getData()}.
	 */
	@Test
	public void testGetData() {
		System.out.println("Singleton1: " + singleton1.getData());
		System.out.println("Singleton2: " + singleton12.getData());
	}

	/**
	 * Test method for {@link pattern.singleton.models.Singleton1#setData(int)}.
	 */
	@Test
	public void testSetData() {
		singleton1.setData(10);
		System.out.println("Singleton1: " + singleton1.toString() + " | "
				+ singleton1.getData());
		System.out.println("Singleton2: " + singleton12.toString() + " | "
				+ singleton12.getData());
		singleton12.setData(20);
		System.out.println("Singleton1: " + singleton1.toString() + " | "
				+ singleton1.getData());
		System.out.println("Singleton2: " + singleton12.toString() + " | "
				+ singleton12.getData());
	}

}
