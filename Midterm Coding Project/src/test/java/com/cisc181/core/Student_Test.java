package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Student> studentList = new ArrayList<Student>();
	static ArrayList<Course> courseList = new ArrayList<Course>();
	static ArrayList<Semester> semesterList = new ArrayList<Semester>();
	static ArrayList<Section> sectionList = new ArrayList<Section>();
	static ArrayList<Enrollment> enrollList = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setup(){
		
		Course c = new Course(UUID.randomUUID(), "Chem", 10, eMajor.PHYSICS);
		Course c1 = new Course(UUID.randomUUID(), "Phys", 20,eMajor.PHYSICS);
		Course c2 = new Course(UUID.randomUUID(), "MATH", 15,eMajor.PHYSICS);

		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
		
		Semester sm = new Semester(UUID.randomUUID(), new Date(1988, 5 ,5), new Date(1988, 8 ,5));
		Semester sm1 = new Semester(UUID.randomUUID(), new Date(1988, 5 ,5), new Date(1988, 8 ,5));

		semesterList.add(sm);
		semesterList.add(sm2);

		Section sec = new Section(c1.getCourseID(), sem1.getSemesterID(), UUID.randomUUID(), 1);
		Section sec1 = new Section(c1.getCourseID(), sem2.getSemesterID(), UUID.randomUUID(), 1);
		Section sec2 = new Section(c2.getCourseID(), sem1.getSemesterID(), UUID.randomUUID(), 1);
		Section sec3 = new Section(c2.getCourseID(), sem2.getSemesterID(), UUID.randomUUID(), 1);
		Section sec4 = new Section(c3.getCourseID(), sem1.getSemesterID(), UUID.randomUUID(), 1);
		Section sec5 = new Section(c3.getCourseID(), sem2.getSemesterID(), UUID.randomUUID(), 1);
		
		sectionList.add(sec);
		sectionList.add(sec1);
		sectionList.add(sec2);
		sectionList.add(sec3);
		sectionList.add(sec4);
		sectionList.add(sec5);
		
		Student s = new Student("null", "null", "null", null, eMajor.PHYSICS,null, null, null);
		Student s1 = new Student("null", "null", "null", null, eMajor.PHYSICS,null, null, null);
		Student s2 = new Student("null", "null", "null", null, eMajor.PHYSICS,null, null, null);
		Student s3 = new Student("null", "null", "null", null, eMajor.PHYSICS,null, null, null);
		Student s4 new Student("null", "null", "null", null, eMajor.PHYSICS,null, null, null);
		Student s4 = new Student("null", "null", "null", null, eMajor.PHYSICS,null, null, null);
		Student s6 = new Student("null", "null", "null", null, eMajor.PHYSICS,null, null, null);
		Student s7 = new Student("null", "null", "null", null, eMajor.PHYSICS,null, null, null);
		Student s8 = new Student("null", "null", "null", null, eMajor.PHYSICS,null, null, null);
		Student s9 = new Student("null", "null", "null", null, eMajor.PHYSICS,null, null, null);
		
		studentList.add(s);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		studentList.add(s9);
		

		for (Section sec : sectionList) {
			for (Student s : studentList) {
				enrollList.add(new Enrollment(stu.getStudentID(), sec.getSectionID()));
			}
		}

		for (Enrollment enrollment : enrollList) {
			enrollment.setGrade(100);

		}
	}

	@Test
	public void testgpa() {
		double gpa;
		static ArrayList<double> grade = new ArrayList<double>();
		for (Enrollment e :enrillList) {
			grade.add(e.getGrade();
		}
		double gpa =;
		
		
		
		assertEquals(gpa, 4);
	}
	public void testavggrade() {

		static ArrayList<double> grade = new ArrayList<double>();

	
		assertEquals(avgGrade, 100);
		
	}
	
}