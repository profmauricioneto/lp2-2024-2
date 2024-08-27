package org.unichristus.classrelationship.exercise01;

import java.util.List;
import java.util.ArrayList;

public class Course {
    public String name_course;
    public int id_course;
    public List<Student> students;
    public University university;

    public Course(String name_course, int id_course, University university) {
        this.name_course = name_course;
        this.id_course = id_course;
        this.university = university;
        students = new ArrayList<>();
    }

    public String getNameCourse() {
        return name_course;
    }

    public int getIdCourse() {
        return id_course;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void getAllStudents() {
        for (Student s: students) {
            System.out.println(s.getStudentName());
        }
    }
//    public void setUniversity(University university) {
//        this.university = university;
//    }
}
