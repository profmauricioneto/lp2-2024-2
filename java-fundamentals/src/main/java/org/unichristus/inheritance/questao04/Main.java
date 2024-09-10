package org.unichristus.inheritance.questao04;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento(1);
        PessoaFisica pessoaFisica = new PessoaFisica(1, "João");
        Pessoa pessoa = new Pessoa(2);
        pessoa.setNome("maria");
        pessoaFisica.setCpf("123.456.789-00");
        pessoaFisica.setDepartamento(departamento);
        departamento.addPessoa(pessoaFisica);
        departamento.addPessoa(pessoa);
        departamento.showPessoas();
    }
}
