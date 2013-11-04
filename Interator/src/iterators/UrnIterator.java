package iterators;

import iterables.Urn;

import java.util.Iterator;

/**
 * 
 * @author luongnv89
 * @version 1 Iterates over the array of other iterators which the ordering of other iterators is reversed.
 * 
 */
public class UrnIterator implements Iterator<String> {

	private int curTabIndex;
	private Iterator<String> curTab;
	private Urn tables;

	public UrnIterator(Urn tab) {
		this.tables = tab;
		this.curTabIndex = 0;
		this.curTab = tables.data[this.curTabIndex].iterator();
	}

	public String next() {
		if (!curTab.hasNext()) {
			curTabIndex++;
			curTab = tables.data[curTabIndex].iterator();
		}
		return curTab.next();
	}

	public boolean hasNext() {
		return !(curTabIndex == tables.length() - 1 && !curTab.hasNext());
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