package examples;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A dummy data class <code> (prenom, nom) </code> for illustrating different iteration techniques
 * over a collection of person objects
 *
 */
 class Person{
	
	String prenom;
	String nom;
	
	public Person (String p, String n){prenom =p; nom =n;}
	
	public String toString (){return prenom+" "+nom;}
	
}

/**
 * Create 3 person objects and place them in an ArrayList<br>
 * Iterate over the list in two different ways:
 * <ul>
 * <li> using explicit iterator </li>
 * <li> using implicit iterator 'hidden' in a for loop</li>
 * </ul>
 * EXPECTED OUTPUT:
 * <pre>
Iterating through persons using explicit iterator
john smith
paul gibson
paul gibson
Iterating through persons using implicit iterator (java 1.5)
john smith
paul gibson
paul gibson
 * </pre>
 */
public class IteratorExample2 {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList persons = new ArrayList();
		 
		Person p;
		
		p = new Person("john", "smith");
		persons.add(p); 
		
		p = new Person("paul", "gibson");
		persons.add(p); 
		
		p = new Person("paul", "gibson");
		persons.add(p); 
		
		System.out.println("Iterating through persons using explicit iterator");
		Iterator i = persons.iterator(); 
		while(i.hasNext()){p= (Person)i.next(); System.out.println(p);}
	
		System.out.println("Iterating through persons using implicit iterator (java 1.5)");
	    for(Object p2 : persons){System.out.println(p2);}
	    
	}
}