package org.unichristus.jdbcdao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private Scanner in;
    private UserDAO dao;
    private BufferedReader reader;

    public Main(){
        in = new Scanner(System.in);
        reader = new BufferedReader(new InputStreamReader(System.in));
        dao = new UserDAO();
    }
    public void start() {
        boolean exit = true;
        do {
            System.out.println("Operation:");
            System.out.print("1-Add User\n2-Remove\n3-Update\n4-Show Users\n5-Exit\nOption: ");
            int op = in.nextInt();
            switch(op) {
                case 1: {
                    try {
                        addUser();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2: {
                    try {
                        deleteUser();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 3: {
                    try {
                        updateUser();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 4: {
                    showData();
                    break;
                }
                case 5: {
                    System.out.println("Exit!");
                    dao.close();
                    exit = false;
                    break;
                }
                default: {
                    System.out.println("No option available.");
                    break;
                }
            }
        }while(exit != false);
    }

    public void addUser() throws IOException {
        User user = new User();

        System.out.print("Name: ");
        String name = reader.readLine();
        user.setName(name);

        System.out.print("Email: ");
        String email = reader.readLine();
        user.setEmail(email);

        System.out.print("Address: ");
        String address = reader.readLine();
        user.setAddress(address);

        Calendar calendar = Calendar.getInstance();
        user.setCreateDate(calendar);
        dao.addUser(user);
    }

    public void deleteUser() throws IOException {
        System.out.print("Id: ");
        long id = in.nextLong();
        dao.delete(id);
    }

    public void updateUser() throws IOException {
        User user = new User();

        System.out.print("ID: ");
        long id = in.nextLong();

        System.out.print("New name: ");
        String nome = reader.readLine();
        user.setName(nome);

        System.out.print("New Email: ");
        String email = reader.readLine();
        user.setEmail(email);

        System.out.print("New Address: ");
        String address = reader.readLine();
        user.setAddress(address);

        Calendar calendar = Calendar.getInstance();
        user.setCreateDate(calendar);
        dao.update(user, id);
    }

    public void showData() {
        dao.showUsers();
    }

    public void finish() {
        in.close();
        try {
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main jdbc = new Main();
        jdbc.start();
    }
}
