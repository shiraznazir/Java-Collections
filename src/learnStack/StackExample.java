package learnStack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Cow");
		animals.add("Buffalo");
		animals.add("Horse");
		
		System.out.println("Stack : " + animals);
		
		System.out.println("Peek : " + animals.peek());
		
		System.out.println("Pop : " + animals.pop());
		
		System.out.println("Stack : " + animals);

	}

}
