package learnSet;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>();

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
