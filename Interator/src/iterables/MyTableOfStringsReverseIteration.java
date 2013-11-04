package iterables;
import iterators.MyTableOfStringsReverseIterator;

import java.lang.Iterable;
import java.util.Iterator;


/**
 * 
 * @author J Paul Gibson
 * @version 1
 *
 * Wraps an array of String data in an {@link Iterable} class, where
 *  we iterate through the elements in reverse order<br>
 * 
 */
public class MyTableOfStringsReverseIteration implements Iterable<String> {
	
	
public String[] data;

public MyTableOfStringsReverseIteration(String [] data) {
this.data = data;
}

public int length(){return data.length;}

public Iterator<String> iterator() {
return new MyTableOfStringsReverseIterator(this);
}

}
