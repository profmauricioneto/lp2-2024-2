package org.unichristus.projects.todolist;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String nameUSer;
    private int idUser;
    private List<Task> todolist;
    private static int instanceNumber = 0;

    private static int incrementarInstance() {
        return ++instanceNumber;
    }

    public User(String nameUSer) {
        this.nameUSer = nameUSer;
        this.idUser = incrementarInstance();
        this.todolist = new ArrayList<>();
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNameUSer() {
        return nameUSer;
    }

    public void setNameUSer(String nameUSer) {
        this.nameUSer = nameUSer;
    }

    public void addTask(String title) {
        Task task = createTask(title);
        this.todolist.add(task);
    }

    public void addTask(String title, String description) {
        Task task = createTask(title, description);
        this.todolist.add(task);
    }

    public void removeTask(int idTask) {
        for (Task t: todolist) {
            if (t.getIdTask() == idTask) {
                todolist.remove(t);
            }
        }
    }

    public void doneTask(int idTask) {
        for (Task t: todolist) {
            if (t.getIdTask() == idTask) {
                t.makeDone();
            }
        }
    }

    private Task createTask(String title) {
        return new Task(title);
    }

    private Task createTask(String title, String description) {
        return new Task(title, description);
    }

    public void showTasks() {
        for(Task t: todolist) {
            System.out.println("Title: " + t.getTitle());
            System.out.println("Description: " + t.getDescription());
            System.out.println("Done: " + t.getIsDone());
        }
    }

}
