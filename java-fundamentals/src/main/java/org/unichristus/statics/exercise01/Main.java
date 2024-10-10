package org.unichristus.statics.exercise01;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario();
        Usuario user2 = new Usuario();
        Usuario user3 = new Usuario();
        Usuario user4 = new Usuario();

        System.out.println(user1.getId());
        System.out.println(user2.getId());
        System.out.println(user3.getId());
        System.out.println(user4.getId());

        System.out.println(Usuario.getContator());
    }
}
