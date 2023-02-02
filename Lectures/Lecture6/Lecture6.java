import java.util.*;

public class Lecture6{

	public static void main(String[] args){
		exercise2();
	}
	
	public static void exercise2(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mutator or");
		list.add("Accessor?");
		
		ArrayList<String> list1 = list;
		ArrayList<String> list2 = list;
		ArrayList<String> list3 = list;
		ArrayList<String> list4 = list;
		ArrayList<String> list5 = list;
		
		list3.add("It is all just a reference to an object!");
		
		System.out.println(list5.get(2));
		// Ok, so what happens here ...
		list5 = null;
		System.out.println("What about this?");
		System.out.println(list2.get(2));
		
		/* Exercise 2
		When you uncomment the following,
		compile, and then run - expect an error!
		*/
		/*
		list = null;
		list1 = null;
		list2 = null;
		list3 = null;
		list4 = null;
		System.out.println("Now?");
		System.out.println(list5.get(2));
		*/
		
	}

}

