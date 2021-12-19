package learnSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();

		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(32);
		set.add(65);
		
		System.out.println(set);

		set.remove(2);

		System.out.println(set);

		System.out.println(set.contains(100));

	}

}
