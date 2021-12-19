package learnList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();

		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);

		System.out.println(list);

		System.out.println("For loop :------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("For Each loop :------------");
		for (int item : list) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println("Iterator :------------");
		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
