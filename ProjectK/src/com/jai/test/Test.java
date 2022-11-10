package com.jai.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jai.first.demo.Demo;
import com.jai.first.student.Student;

public class Test {
	public static void main(String[] args) {

		ArrayList<Student> a=new ArrayList<Student>();
		a.add(new Student(1, "jaideep", "6564340", 24));
		a.add(new Student(14, "yeswanth", "7952102", 22));
		a.add(new Student(17, "lisa", "3682114", 31));
		a.add(new Student(5, "ramudu", "7466465", 34));
		a.add(new Student(9, "srikanth", "545642", 27));
		
	a.stream().sorted((q,w)->q.getAge()-w.getAge()).filter(s->s.getName().length()>5).map(s->s.getId()*5).forEach(System.out::println);
		
//		Collections.sort(a,(o1, o2) -> o1.getMobileNo().compareTo(o2.getMobileNo()) );
//		
//		a.stream().forEach((s)->System.out.println(s));
	 
	}
}
