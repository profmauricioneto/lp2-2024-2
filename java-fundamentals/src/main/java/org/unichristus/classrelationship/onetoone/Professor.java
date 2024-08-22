package org.unichristus.classrelationship.onetoone;

public class Professor {
    public String nameProfessor;
    public int id;
    public Course course;

    public Professor(String nameProfessor, int id) {
        this.nameProfessor = nameProfessor;
        this.id = id;
        this.course = null;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getCourseName() {
        return this.course.courseName;
    }
}
