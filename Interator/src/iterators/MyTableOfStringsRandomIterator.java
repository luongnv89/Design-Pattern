package iterators;

import iterables.MyTableOfStringsRandomIteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * 
 * @author luongnv89
 * @version 1 Iterates over the String elements which the ordering is random.
 * 
 */
public class MyTableOfStringsRandomIterator implements Iterator<String> {

	private int index;
	private ArrayList<Integer> listVisited = new ArrayList<Integer>();
	private MyTableOfStringsRandomIteration table;

	public MyTableOfStringsRandomIterator(MyTableOfStringsRandomIteration tab) {
		index = tab.length() - 1;
		table = tab;
		for (int i = 0; i < index+1; i++) {
			listVisited.add(i);
		}
	}

	public String next() {
		Random ran = new Random();
		
		int nextIndex = ran.nextInt(listVisited.size());
		int next = listVisited.get(nextIndex);
		listVisited.remove(nextIndex);
		
		return table.data[next];
	}

	public boolean hasNext() {
		return !listVisited.isEmpty();
	}

	/**
	 * @throws UnsupportedOperationException
	 *             as we cannot remove elements while iterating over the
	 *             collection
	 */
	public void remove() {
		throw new UnsupportedOperationException();
	}

}