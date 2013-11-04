package tests;

import iterables.MyTableOfStringsRandomIteration;
import iterables.MyTableOfStringsReverseIteration;

/**
 * 
 * @author J Paul Gibson
 * @version 1
 * 
 *          A simple test for the {@link MyTableOfStringsReverseIteration}<br>
 * <br>
 * 
 *          TYPICAL EXPECTED OUTPUT : <br>
 * 
 *          <pre>
 * Iterate over original data array
 *  one
 *  two
 *  three
 *  four
 *  one
 * 
 * Iterate over same data in MyTableOfStringsReverseIteration
 *  one
 *  four
 *  three
 *  two
 *  one
 * </pre>
 **/
public class MyTableOfStringsIteration_Test {

	public static void main(String[] s) {

		String[] data = { "one", "two", "three", "four", "one" };
		MyTableOfStringsReverseIteration t1 = new MyTableOfStringsReverseIteration(
				data);
		MyTableOfStringsRandomIteration t2 = new MyTableOfStringsRandomIteration(
				data);

		System.out.println("Iterate over original data array");
		for (String value : data) {
			System.out.println(" " + value);
		}
		System.out
				.println("\nIterate over same data in MyTableOfStringsReverseIteration");
		for (String value : t1) {
			System.out.println(" " + value);
		}

		System.out
				.println("\nIterate over same data in MyTableOfStringsRandomIteration");
		for (String value : t2) {
			System.out.println(" " + value);
		}

	}
}
