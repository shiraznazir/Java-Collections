package learnMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> num = new HashMap<>();
		
		num.put("One", 1);
		num.put("Two", 2);
		num.put("Three", 3);
		num.put("Four", 4);
		num.put("Five", 5);
		
		System.out.println(num);
		
		num.remove("Four", 4);
		
		for(Map.Entry<String, Integer> e: num.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		

	}

}
