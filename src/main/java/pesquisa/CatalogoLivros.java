package main.java.pesquisa;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos da classe, que é uma lista de livros
    private List<Livro> livroList;

    //construtor da classe, instancia um novo objeto
    public CatalogoLivros() {this.livroList = new ArrayList<>();}

    //metodo que adc livros a lista principal. dado nome adicionarLivro
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){

        //adciona um novo livro com os parametros obrigatorios
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //metodo de pesquisa de livros por autor
    public List<Livro> pesquisarPorAutor(String autor){

        //onde vai ser armazenado uma lista so para esse metodo retornar algo, dado nome LivroPorAutor
        List<Livro> LivroPorAutor = new ArrayList<>();

        //a lista esta vazia?
        if(!livroList.isEmpty()){//se a lista principal tiver vazia eu nem começo
            for(Livro l : livroList){ // percorrer a LISTA dado (l) dentro da principal
                if(l.getAutor().equalsIgnoreCase(autor)){ // se o autor = ao do parametro entao adc na lista l
                    LivroPorAutor.add(l);
                }
            }
        }
        return LivroPorAutor;
    }
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }

        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPesquisado = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPesquisado = l;
                    break;
                }
            }
        }
        return livroPesquisado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("1984", "George Orwell", 1949);
        catalogoLivros.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalogoLivros.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("Orgulho e Preconceito", "Jane Austen", 1813);
        catalogoLivros.adicionarLivro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        catalogoLivros.adicionarLivro("Moby Dick", "Herman Melville", 1851);
        catalogoLivros.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
        catalogoLivros.adicionarLivro("A Divina Comédia", "Dante Alighieri", 1320);
        catalogoLivros.adicionarLivro("Hamlet", "William Shakespeare", 1600);

        System.out.println(catalogoLivros.pesquisarPorAutor("Miguel de Cervantes"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(1600, 1945));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Cem Anos de Solidão"));
    }
}
