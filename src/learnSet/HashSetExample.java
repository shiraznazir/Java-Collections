package learnSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(32);
		set.add(65);
		
		set.remove(2);
		
		System.out.println(set);
		
		System.out.println(set.contains(100));
		
		set.clear();
		
		System.out.println(set);

	}

}
