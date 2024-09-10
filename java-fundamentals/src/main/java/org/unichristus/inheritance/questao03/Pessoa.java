package org.unichristus.inheritance.questao03;

public class Pessoa {
    private int id;
    protected String nome;
    public String email;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.email = "sem email";
    }

    public String getNome() {
        return nome;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    public void informations() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
    }
}
