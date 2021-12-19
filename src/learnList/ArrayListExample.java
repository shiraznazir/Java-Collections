package learnList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.add(5);
		
		//System.out.println(arraylist);
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		
		list.addAll(arraylist);
		
		System.out.println(list);
		
		System.out.println("For loop :------------");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("For Each loop :------------");
		for(int item: list) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println("Iterator :------------");
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		

	}

}
