package iterables;

import iterators.MyTableOfStringsRandomIterator;

import java.util.Iterator;


/**
 * 
 * @author luongnv89
 * @version 1
 *
 * Wraps an array of String data in an {@link Iterable} class, where
 *  we iterate through the elements in random order<br>
 * 
 */
public class MyTableOfStringsRandomIteration implements Iterable<String> {
	
	
public String[] data;

public MyTableOfStringsRandomIteration(String [] data) {
this.data = data;
}

public int length(){return data.length;}

public Iterator<String> iterator() {
return new MyTableOfStringsRandomIterator(this);
}

}
