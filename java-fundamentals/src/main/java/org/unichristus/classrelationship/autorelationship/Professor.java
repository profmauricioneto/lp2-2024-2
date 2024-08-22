package org.unichristus.classrelationship.autorelationship;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    public String name_professor;
    public int id_professor;
    public List<Course> courses = new ArrayList<>();
    public Professor(String name_professor, int id_professor) {
        this.name_professor = name_professor;
        this.id_professor = id_professor;
    }
    public void addCourse(Course course) {
        this.courses.add(course);
    }
}