package org.unichristus.classrelationship.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public String courseName;
    public int courseId;
    public List<Professor> professors;

    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.professors = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void showProfessors() {
        for (Professor p: professors) {
            System.out.println(p.getProfessorName());
        }
    }
}
