package Collections;

//import util package[all classes]
import java.util.*;

public class start {

	public static void main(String[] args) {
/*
	Creating Collections
	
	1-Type Safe - same type of elements (objects) are added to collection
	
	2- UnType Safe - different types of elements
	
		
*/
//1) Type Safe Collection
		List<String> name = new ArrayList<>();
		name.add("max");
		name.add("john");
		name.add("peter");
		System.out.println(name);
		Objec
//		
//		//Index Collection
//		System.out.println(name.get(1));
//		System.out.println(name.get(0));
//		
//		//duplicates allowed
//		name.add("peter");
//		
//		//remove
//		name.remove("max");
//		System.out.println(name);
//		
//		//size
//		System.out.println("size = "+ name.size());
//		
//		//contains?
//		System.out.println(name.contains("max"));
//		
//		//check for empty
//		System.out.println(name.isEmpty());
//		
//		//Remove element and replace
//		name.set(1, "ram");
//		System.out.println(name);
//		
//		//shift element
//		name.add(1, "shayam");
//		System.out.println(name);
//		
//		//remove all element
//	//	name.clear();
//		//System.out.println(name);
//		
//		Vector<String> vector = new Vector<>();
//		vector.addAll(name);
//		System.out.println(name);
//		
//		// https://www.geeksforgeeks.org/arraylist-in-java/
//		//https://www.geeksforgeeks.org/linked-list-in-java/
//		
//		//same operations for arraylist, linkedlist, vector, stack
//		
//		
//		
//		System.out.println("----------------unsafetype _________________________________");
//		
////2)UnType Safe
//		LinkedList list  = new LinkedList();
//		list.add("sachin");
//		list.add(101);
//		list.add(245.328);
//		list.add(true);
//		System.out.println(list);
//		
//		
//		System.out.println("-----------------Set _________________________________");
//		
//		//HashSet
//		HashSet<Double> nms = new HashSet<>();
//		nms.add(14.14);
//		nms.add(34.759);
//		nms.add(85.04);
//		nms.add(1.01289);
//		nms.add(0.58);
//		
//		//no duplicates
//		nms.add(85.04);
//		System.out.println(nms);
//		
//		
//		System.out.println("---------------TreeSet________________");
//		
//		//treeset sort the elements
//		TreeSet<Double> tset = new TreeSet<>();
//		tset.addAll(nms);
//		System.out.println(tset);
	}

}
