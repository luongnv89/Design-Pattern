package iterators;

import iterables.MyTableOfStringsReverseIteration;

import java.util.Iterator;


/**
 * 
 * @author J Paul Gibson
 * @version 1
 * Iterates over the String elements from last to first
 *
 */
public class MyTableOfStringsReverseIterator implements Iterator<String> {
	
private int index;
private MyTableOfStringsReverseIteration table;

public MyTableOfStringsReverseIterator(MyTableOfStringsReverseIteration tab) {
index = tab.length()-1;
table = tab;
}

public String next() {
index--;
return table.data[index +1];
}

public boolean hasNext() {
return index >= 0;
}

/**
 * @throws UnsupportedOperationException as we cannot remove elements while iterating over the collection
 */
public void remove() {
throw new UnsupportedOperationException();
}

}