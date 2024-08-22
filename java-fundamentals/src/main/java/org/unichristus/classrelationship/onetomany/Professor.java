package org.unichristus.classrelationship.onetomany;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    public String professorName;
    public int professorId;
    public List<Course> courses;

    public Professor(String professorName, int professorId) {
        this.professorName = professorName;
        this.professorId = professorId;
        this.courses = new ArrayList<>();
    }

    public String getProfessorName() {
        return professorName;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void getAllCourses() {
       for (Course c: courses) {
           System.out.println(c.getCourseName());
       }
    }

}
