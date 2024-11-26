package main.java.ordenacao;

import java.util.*;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();

    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenadoPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa pessoa = new OrdenacaoPessoa();
        pessoa.adicionarPessoa("jeff", 30, 1.73);
        pessoa.adicionarPessoa("julian", 45, 1.63);
        pessoa.adicionarPessoa("josee", 25, 1.83);

        System.out.println(pessoa.pessoaList);

        System.out.println(pessoa.ordenadoPorIdade());
        System.out.println(pessoa.ordenadoPorAltura());
    }
}
