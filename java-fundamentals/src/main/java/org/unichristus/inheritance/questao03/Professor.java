package org.unichristus.inheritance.questao03;

public class Professor extends Pessoa {
    public Professor(int id, String nome, String email) {
        super(id, nome);
        setEmail(email);
    }
}
