package org.unichristus.projects.todolist;

import java.util.Scanner;

public class TaskListApp {

    public TaskListApp() {
        init();
    }

    private User createUser(Scanner scan) {
        System.out.println("User Name: ");
        String userName = scan.nextLine();
        User user = new User(userName);
        return user;
    }

    private int showOptions(Scanner scan) {
        System.out.println("1-Add Task\n2-Remove Task\n3-Make task done");
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }

    public void init() {
        Scanner scan = new Scanner(System.in);
        User user = createUser(scan);
        int option;
        do {
            option = showOptions(scan);
            switch (option) {
                case 1: {
                    System.out.println("Title: ");
                    String title = scan.nextLine();
                    System.out.println("Description: ");
                    String description = scan.nextLine();
                    user.addTask(title, description);
                    user.showTasks();
                    break;
                }
                case 2: {
                    System.out.println("ID: ");
                    int idTask = scan.nextInt();
                    user.removeTask(idTask);
                    user.showTasks();
                    break;
                }
                case 3: {
                    System.out.println("ID: ");
                    int idTask = scan.nextInt();
                    user.doneTask(idTask);
                    user.showTasks();
                    break;
                }
                case 5: {
                    System.out.println("Bye bye!");
                }
                default:
                    System.out.println("Invalid Option");

            }

        } while(option != 5);
        scan.close();
    }
    public static void main(String[] args) {
        TaskListApp taskapp = new TaskListApp();
    }
}
