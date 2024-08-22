package org.unichristus.classrelationship.onetoone;

public class Course {
    public String courseName;
    public int code;
    public Professor professor;

    public Course(String courseName, int code) {
        this.courseName = courseName;
        this.code = code;
        this.professor = null;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getProfessorName() {
        return professor.nameProfessor;
    }

}
