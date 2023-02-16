package edu.canisius.csc.lsp;

import java.util.*;

public class InterfaceDemo{


	public static void main(String args[]){
		
/** Exercise 1
		
		System.out.println("Welcome to the Interface Demo!");
		IntSequence intseq = new DigitSequence(1028328);
		intseq.next();
		// 1. Cast it to DigitSecquence 
		DigitSequence digseq = (DigitSequence)intseq;
		// 2. Cast it to Object
		Object obj = (Object)digseq;
		// 3. Go back down, cast it back to DigitSequence
		DigitSequence downCast = (DigitSequence)obj;
		System.out.println("That all worked");
		
		// 4. Done another way
		Class<?> cls = downCast.getClass();
		System.out.println("---------------------------------");
		System.out.println("Here is the class hierarchy for DigitSequence");
		while (cls != null) {
			System.out.println("---------------------------------");
			System.out.println(cls.getSimpleName());
			cls = cls.getSuperclass();
		}
		
		// 5. Where are the interfaces?
		System.out.println("---------------------------------");
		System.out.println("Wait, where are the Interfaces?");
		System.out.println("You get them this way.");
		System.out.println("---------------------------------");
		for (Class<?> intf : downCast.getClass().getInterfaces()) {
			System.out.println("  implements " + intf.getName());
		}
		System.out.println("---------------------------------");
		
End Exercise 1 **/  
		
/** Exercise 2
	// Remember the obj - you can tell what it is with instanceof
	if(obj instanceof IntSequence){
		System.out.println("obj is an IntSequence");
	}
	
	if(obj instanceof DigitSequence){
		System.out.println("obj is a DigitSequence");
		System.out.println("This casting stuff is annoying.  Try to intepret the below");
		System.out.println(((DigitSequence)obj).rest());
	}

	if(obj instanceof DigitSequence digits){
		System.out.println("pattern matching was dded to make life easier!");
		System.out.println(digits.rest());
	}

End Exercise 2 **/

/** Exercise 4
	List<Integer> numbers = List.of(1, 2, 3, 4, 5);
	numbers.add(6);
End Exercise 4**/
	
	}
	
	public static double average(IntSequence seq, int n){
	
		int count = 0;
		double sum =0;
		while(seq.hasNext()  && count < n){
			count++;
			sum += seq.next();
		}
	
		return count == 0 ? 0: sum / count;
	
	}

}

