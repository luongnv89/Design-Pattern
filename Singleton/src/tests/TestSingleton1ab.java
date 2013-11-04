package tests;

import models.Singleton1;
import models.Singleton1a;
import models.Singleton1b;

/**
 * Test class for {@link Singleton1}<br>
 * 
 * <ul>
 * <li>Construct 1 {@link Singleton1a} objects using the instance method</li>
 * <li>Construct 1 {@link Singleton1} objects using the instance method</li>
 * <li>ClassCastExeption with : Construct 1 {@link Singleton1b} objects using the instance method</li>
 * <li>Set the data value of the first and print info. concerning all objects
 * to the screen</li>
 * <li>Check that the references and values for all objects are the same</li>
 * </ul>
 * <br>
 * EXPECTED (TYPICAL) OUTPUT
 * 
 * <pre>
 * First singleton1: Singleton4.Singleton1a@19821f
 * First singleton1 data value =  34
 * I am a Singleton 1A
 * Second singleton1: Singleton4.Singleton1a@19821f
 * Second singleton1 data value =  34
 * </pre>
 * 
 * EXPECTED (EXEPTION) OUTPUT
 * <pre>
 * Exception in thread "main" java.lang.ClassCastException: A different Singleton already exists, you cannot create new Singleton!
 * </pre>
 * @author J Paul Gibson
 * 
 * @version 1:
 */
public class TestSingleton1ab {

	public static void main(String args[]) {
		// Construct 3 singleton1 objects using the instance method
		Singleton1 s1a = Singleton1a.instance();
		Singleton1 s1b = Singleton1.instance();
		Singleton1 s1c = Singleton1b.instance();
		
		// Set the data value.
		s1a.setData(34);
		System.out.println("First singleton1: " + s1a);
		System.out.println("First singleton1 data value =  " + s1a.getData());
		System.out.println(((Singleton1a) s1a).sayHello());
		System.out.println("Second singleton1: " + s1b);
		System.out.println("Second singleton1 data value =  " + s1b.getData());
//		System.out.println(((Singleton1b) s1c).sayHello());
	}
}
