package atividade9;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "Dom Casmurro";
        l1.autor = "Machado de Assis";
        l1.numeroPaginas = 256;

        Livro l2 = new Livro();
        l2.titulo = "O Pequeno Príncipe";
        l2.autor = "Antoine de Saint-Exupéry";
        l2.numeroPaginas = 96;

        Livro l3 = new Livro();
        l3.titulo = "Capitães da Areia";
        l3.autor = "Jorge Amado";
        l3.numeroPaginas = 280;

        l1.mostrarDetalhes();
        l2.mostrarDetalhes();
        l3.mostrarDetalhes();

        System.out.println();
        l1.abrirLivro();
        l1.fecharLivro();
        l2.abrirLivro();
        l2.fecharLivro();
    }
}
