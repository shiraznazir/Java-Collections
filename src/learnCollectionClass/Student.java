package learnCollectionClass;

import java.util.Objects;

public class Student implements Comparable<Student>{
	
	String name;
	int roll_No;
	
	public Student(String name, int roll_No) {
		this.name = name;
		this.roll_No = roll_No;
	}
	
	public String toString() {
		return "Student {" + "name= " + name + '/' + ", roll_No = " + roll_No + "}"; 
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return true;
		
		Student student = (Student)o;
		return roll_No == student.roll_No;
	}

	@Override
	public int hashCode() {
		return Objects.hash(roll_No);
	}

	public int compareTo(Student that) {
		return this.roll_No - that.roll_No;
	}

}
