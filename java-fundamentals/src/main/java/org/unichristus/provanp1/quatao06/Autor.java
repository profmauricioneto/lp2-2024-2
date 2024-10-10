package org.unichristus.provanp1.quatao06;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    List<Livro> livros;

    public Autor(String nome) {
        this.nome = nome;
        livros = new ArrayList<>();
    }

    public void addLivro(Livro l) {
        this.livros.add(l);
    }

    public void mostrarLivros() {
        for(Livro l: livros) {
            System.out.println(l.getTitulo());
        }
    }

    public String getNomeAutor() {
        return nome;
    }
}
