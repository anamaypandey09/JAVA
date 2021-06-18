package Collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("max");
		name.add("john");
		name.add("peter");
		name.add("joe");
		name.add("tom");
		
		//for each loop
		for(String str:name) {
			System.out.println(str+"\t"+str.length());
		}
		
		System.out.println("_______________________________");
		
		//for each iterator
		name.forEach(e->{
			System.out.println(e);
		});
		
		
		System.out.println("_______________________________");
		
		TreeSet<String> set = new TreeSet<>();
		set.addAll(name);
		set.forEach(e->{
			System.out.println(e);
		});
	}

}
