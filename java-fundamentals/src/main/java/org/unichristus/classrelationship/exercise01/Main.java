package org.unichristus.classrelationship.exercise01;

public class Main {
    public static void main(String[] args) {
        University unichristus = new University("Unichristus", "Centro Universitário Christus");

        Course ads = new Course("Analise e Desenvolvimento de Sistemas", 123, unichristus);
        Course si = new Course("Sistemas de Informação", 124, unichristus);
        Course cc = new Course("Ciência da Computação", 125, unichristus);

        unichristus.addCourse(ads);
        unichristus.addCourse(si);
        unichristus.addCourse(cc);

        Student fulano = new Student("Fulano", "1234", ads);
        Student john = new Student("John", "1235", si);
        Student sam = new Student("Sam", "1236", cc);
        Student maria = new Student("Maria", "1237", ads);
        Student julia = new Student("Julia", "1238", ads);

        ads.addStudent(fulano);
        ads.addStudent(maria);
        ads.addStudent(julia);

        cc.addStudent(sam);
        si.addStudent(john);

        unichristus.getNameCourses();
        System.out.println("Total de Estudantes");
        System.out.println(unichristus.getTotalStudents());
    }
}
