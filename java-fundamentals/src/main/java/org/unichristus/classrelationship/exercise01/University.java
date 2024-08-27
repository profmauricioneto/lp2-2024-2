package org.unichristus.classrelationship.exercise01;

import java.util.ArrayList;
import java.util.List;

public class University {
    public String name_university;
    public String decription;
    public List<Course> courses;

    public University(String name_university, String decription) {
        this.name_university = name_university;
        this.decription = decription;
        courses = new ArrayList<>();
    }

    public String getNameUniversity() {
        return name_university;
    }

    public void getNameCourses() {
        for (Course c : courses) {
            System.out.println(c.getNameCourse());
        }
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public int getTotalCourses() {
        return courses.size();
    }

    public int getTotalStudents() {
        int acc = 0;
        for (Course c : courses) {
            acc = acc + c.students.size();
        }
        return acc;
    }

}
