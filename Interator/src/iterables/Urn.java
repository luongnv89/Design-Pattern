package iterables;

import iterators.UrnIterator;

import java.util.Iterator;

/**
 * 
 * @author luongnv89
 * @version 1
 * 
 *          Wraps an array of MyTableOfStringsReverseIteration data in an {@link Iterable} class, where we
 *          iterate through the elements in order<br>
 * 
 */
public class Urn implements Iterable<String> {

	public MyTableOfStringsReverseIteration[] data;

	public Urn(MyTableOfStringsReverseIteration[] data) {
		this.data = data;
	}

	public int length() {
		return data.length;
	}

	public Iterator<String> iterator() {
		return new UrnIterator(this);
	}

}
