package learnCollectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {

//		List<Integer> num = new ArrayList<Integer>();
//
//		num.add(1);
//		num.add(2);
//		num.add(3);
//		num.add(4);
//		num.add(5);
//		num.add(5);
//		num.add(5);
//		
//		System.out.println("Minimum Number in the array : " + Collections.min(num));
//		System.out.println("Maximum Number in the array : " + Collections.max(num));
//		System.out.println("Frequency of 5: " + Collections.frequency(num, 5));
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Anuj",190));
		list.add(new Student("Rahul",160));
		list.add(new Student("Kali",170));
		list.add(new Student("Ramu",180));
		
		System.out.println(list);
		
		Collections.sort(list, (o1, o2) --> o1.name.compareTo(o2.name));
		
		System.out.println(list);
		
	}

}
