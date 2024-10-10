package org.unichristus.projects.todolist;

public class Task {
    private String title;
    private String description;
    private int idTask;
    private boolean isDone;
    private static int instanceTask = 0;

    private static int incrementTask() {
        return ++instanceTask;
    }

    public Task(String title) {
        this.title = title;
        this.idTask = incrementTask();
        this.isDone = false;
    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.idTask = incrementTask();
        this.isDone = false;
    }

    public void makeDone() {
        this.isDone = true;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdTask() {
        return idTask;
    }

}
