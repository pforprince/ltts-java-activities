package day6.activity5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day6.activity4.Student;

public class ComparableMain {
	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Rohan", 50));
		studentList.add(new Student("Shivam", 70));
		studentList.add(new Student("Virat", 60));
		studentList.add(new Student("Krish", 80));
		studentList.add(new Student("Ram", 40));
		studentList.add(new Student("Sachin", 100));
		
		Collections.sort(studentList, student-> this.name.compare(student.getName()));

		System.out.println("List after getting sort by the student names");
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i));
		}
		
	}
}
