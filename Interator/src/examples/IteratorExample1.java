package examples;
import java.util.*;
public class IteratorExample1 {


/**
 * Traverse an enumeration and print the elements to the screen.<br>
 * <b> Note: </b> this is legacy code which is used for teaching purposes
 * @param e is the enumeration to be traversed
 */
@SuppressWarnings("rawtypes")
private static void traverse(Enumeration e) {
while (e.hasMoreElements()) {
	System.out.println(e.nextElement());
	}

}

/**
 * Illustrate the use of enumerations with vectors and hash tables:
 * <ul>
 * <li> Create a vector and add some items to it. </li>
 * <li> Traverse the vector using an Enumeration. </li>
 * <li> Create a hash table and add some items to it. </li>
 * <li> Traverse the hash table keys using an Enumeration. </li>
 * <li> Traverse the hash table values using an Enumeration. </li>
 * </ul>
 * <b> Note: </b> this is legacy code which is used for teaching purposes <br><br>
 * 
 * EXPECTED OUTPUT ON SCREEN:
 * <pre>
Vector values are:
5
9
Hi, There!

Hash keys are:
Joe
Bob
Fred

Hash values are:
18.5
6.0
32.0
</pre>
 * @param args - command line arguments (not used)
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String args[]) {
	// Create a vector and add some items to it.
	Vector v = new Vector();
	v.addElement(new Integer(5));
	v.addElement(new Integer(9));
	v.addElement(new String("Hi, There!"));

	// Traverse the vector using an Enumeration. 
	Enumeration ev = v.elements();
	System.out.println("\nVector values are:");
	traverse(ev);

	// Create a hash table and add some items to it.
	Hashtable h = new Hashtable();
	h.put("Bob", new Double(6.0));
	h.put("Joe", new Double(18.5));
	h.put("Fred", new Double(32.0));

	// Traverse the hash table keys using an Enumeration.
	Enumeration ekeys = h.keys();
	System.out.println("\nHash keys are:");
	traverse(ekeys);

	// Traverse the hash table values using an Enumeration.
	Enumeration evalues = h.elements();
	System.out.println("\nHash values are:");
	traverse(evalues);
	}


}

