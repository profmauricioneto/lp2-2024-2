package org.unichristus.classrelationship.autorelationship;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public String name_course;
    public int id_course;
    public List<Course> course_with_prerequire;
    public List<Course> course_as_prerequire;
    public Course(String name_course, int id_course) {
        course_with_prerequire = new ArrayList<>();
        course_as_prerequire = new ArrayList<>();
        this.name_course = name_course;
        this.id_course = id_course;
    }
    public void addCourseWithPrerequire(Course course) {
        this.course_with_prerequire.add(course);
    }
    public void addCourseAsPrerequire(Course course) {
        this.course_as_prerequire.add(course);
    }
    public void showAllPrerequireCourses() {
        for(Course pre_require: course_as_prerequire) {
            System.out.println(pre_require.name_course);
        }
    }
}
