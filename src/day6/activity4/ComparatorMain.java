package day6.activity4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day6.activity4.*;

public class ComparatorMain {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Rohan", 50));
		studentList.add(new Student("Shivam", 70));
		studentList.add(new Student("Virat", 60));
		studentList.add(new Student("Krish", 80));
		studentList.add(new Student("Ram", 40));
		studentList.add(new Student("Sachin", 100));
		
		Collections.sort(studentList, (student1, student2)-> student1.getName().compareTo(student2.getName()));

		System.out.println("List after getting sort by the student names");
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i));
		}
		
	}

}
