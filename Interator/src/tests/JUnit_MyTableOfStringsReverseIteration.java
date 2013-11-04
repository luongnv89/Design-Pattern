package tests;

import iterables.MyTableOfStringsReverseIteration;
import iterators.MyTableOfStringsReverseIterator;

import java.util.Iterator;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnit_MyTableOfStringsReverseIteration {
	
	protected MyTableOfStringsReverseIteration iterationUnderTest;
	
	protected String [] data = {"one", "two", "three", "four", "one"};
	
	/**
	 * Should initialise the reverse iterator over the data 
	 * <code> {"one", "two", "three", "four", "one"} </code>
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {	

		iterationUnderTest = new MyTableOfStringsReverseIteration(data);
	}
	
	@After
	public void tearDown() throws Exception {
		iterationUnderTest = null;
	}
	
	/**
	 * tests {@link MyTableOfStringsReverseIterator#iterator()} }
	 */
	@Test
	public void test_iterator() {

		Iterator<String> iterator = iterationUnderTest.iterator();
		
		Assert.assertTrue(iterator.hasNext());
		Assert.assertEquals(data[4],iterator.next());
		Assert.assertEquals(data[3],iterator.next());
		Assert.assertEquals(data[2],iterator.next());
		Assert.assertEquals(data[1],iterator.next());
		Assert.assertEquals(data[0],iterator.next());
		Assert.assertFalse(iterator.hasNext());
	}

}
