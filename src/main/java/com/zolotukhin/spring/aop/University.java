package com.zolotukhin.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
	private List<Student> students = new ArrayList<>();

	public void addStudents() {
		Student st1 = new Student("Sergey Zolotukhin",
				4, 8.0);
		Student st2 = new Student("Maksim Sidorov",
				3, 7.5);
		Student st3 = new Student("Petr Smirnov",
				2, 6.0);
		students.add(st1);
		students.add(st2);
		students.add(st3);
	}

	public List<Student> getStudents(){
		System.out.println("Начало работы метода getStudents");
		System.out.println(students.get(3));
		System.out.println("Information from method getStudents");
		System.out.println(students);
		System.out.println("Конец работы метода getStudents");
		return students;
	}
}
