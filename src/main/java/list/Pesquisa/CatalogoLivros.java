package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String título, String autor, int anoPublicacao){
        livroList.add(new Livro(título, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList)
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal){
                livrosPorIntervaloAnos.add(l);
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTítulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        // Adicionando livros ao catálogo
//        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
//        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
//        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
//        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
//
        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
//
//        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
//        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));
//
        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
//
//        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
//        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));
//
        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
//
//        // Exibindo livros por título (caso em que não há livros com o título especificado)
//        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}
