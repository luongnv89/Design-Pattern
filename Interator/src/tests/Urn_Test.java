package tests;

import iterables.MyTableOfStringsReverseIteration;
import iterables.Urn;


/**
 * 
 * @author J Paul Gibson
 * @version 1
 * 
 * A simple test for the {@link Urn}<br><br>
When initial Urn data structure is initialised as
<pre>
  [["gibson", "smith", "hughes"],
  ["jones", "bell"],
  ["raffy", "lallet"]]
  </pre>
 * it should iterate through each bulletin from first to last, but each name in each bulletin
 * from last to first<br><br>
 * EXPECTED OUTPUT : <br>
 <pre>

Iterate over strings on bulletins in Urn
 hughes
 smyth
 gibson
 bell
 jones
 lallet
 raffy
 </pre>
 **/
public class Urn_Test {
	
	public static void main(String[] s) {
		
		String [] preferences1 = {"gibson", "smyth", "hughes"};
		MyTableOfStringsReverseIteration vote1 = new MyTableOfStringsReverseIteration( preferences1);
		
		String [] preferences2 = {"jones", "bell"};
		MyTableOfStringsReverseIteration vote2 = new MyTableOfStringsReverseIteration( preferences2);
		
		String [] preferences3 = {"raffy", "lallet"};
		MyTableOfStringsReverseIteration vote3 = new MyTableOfStringsReverseIteration( preferences3);
		
		
		MyTableOfStringsReverseIteration [] votes = { vote1, vote2, vote3};
		
		Urn urn = new Urn (votes);


		System.out.println("\nIterate over strings on bulletins in Urn");
		for (String value : urn) {
			System.out.println(" "+value);
			}
		}

}
