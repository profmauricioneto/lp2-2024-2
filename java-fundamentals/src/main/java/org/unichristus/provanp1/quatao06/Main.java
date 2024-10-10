package org.unichristus.provanp1.quatao06;

public class Main {
    public static void main(String[] args) {
        Autor tolkien = new Autor("Tolkien");
        Livro senhorDosAneis = new Livro("Senhor dos Anéis", tolkien);
        tolkien.addLivro(senhorDosAneis);
    }
}
