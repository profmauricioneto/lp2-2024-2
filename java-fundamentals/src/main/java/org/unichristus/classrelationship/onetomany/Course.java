package org.unichristus.classrelationship.onetomany;

public class Course {
    public String courseName;
    public int courseId;
    public Professor professor;

    public Course(String courseName, int courseId, Professor professor) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }
}
