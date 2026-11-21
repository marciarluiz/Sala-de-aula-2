package atividade9;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto;

    void abrirLivro() {
        aberto = true;
        System.out.println("Livro \"" + titulo + "\" foi aberto.");
    }

    void fecharLivro() {
        aberto = false;
        System.out.println("Livro \"" + titulo + "\" foi fechado.");
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas + " | Aberto: " + (aberto ? "Sim" : "Não"));
    }
}
