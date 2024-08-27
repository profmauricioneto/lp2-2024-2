package org.unichristus.classrelationship.exercise01;

public class Student {
    public String studentName;
    public String enrollment;
    public Course course;

    public Student(String studentName, String enrollment, Course course) {
        this.studentName = studentName;
        this.enrollment = enrollment;
        this.course = course;
    }

    public String getStudentName() {
        return studentName;
    }
}
