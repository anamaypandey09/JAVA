package Collections;

import java.util.HashMap;

public class Mapexample {

	public static void main(String[] args) {
		// HashMap<Key,Value>
		
		HashMap<String,Integer> department = new HashMap<>();
		
		//add element
		department.put("QA", 10);
		department.put("devops", 20);
		department.put("marketing", 30);
		department.put("UI/UX", 3);
		department.put("QA", 50);
		//Duplicate keys are not allowed
		department.put("UI/UX", 3);
		department.put("support", 12);
		
		System.out.println(department);
		System.out.println("____________________________");
		
		//iterating
		department.forEach((key,value)->{
			System.out.println(key+"=>"+value);
		});
		
		//if want to get value of a particular key
		System.out.println("____________________________");
		System.out.println(department.get("devops"));
		

	}

}
