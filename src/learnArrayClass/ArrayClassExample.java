package learnArrayClass;

import java.util.Arrays;

public class ArrayClassExample {

	public static void main(String[] args) {
		
		int [] nums = { 10, 20, 30, 1, 2, 3, 21, 22, 23};
		
		Arrays.sort(nums);
		
		int index = Arrays.binarySearch(nums, 3);
		
		System.out.println(index);
		
		Arrays.fill(nums, 12);
		
		for(int i: nums) {
			System.out.print(i + " ");
		}

	}

}
