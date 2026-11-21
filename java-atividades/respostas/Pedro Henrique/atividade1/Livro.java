package atividade1;

public class Livro {

    // Atributos
    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto = false;

    // Método para abrir o livro
    void abrirLivro() {
        aberto = true;
        System.out.println(titulo + " foi aberto!");
    }

    // Método para fechar o livro
    void fecharLivro() {
        aberto = false;
        System.out.println(titulo + " foi fechado!");
    }

    // Método para mostrar detalhes
    void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);

        if (aberto == true) {
            System.out.println("Estado: Aberto");
        } else {
            System.out.println("Estado: Fechado");
        }

        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Primeiro livro
        Livro livro1 = new Livro();

        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;

        // Segundo livro
        Livro livro2 = new Livro();

        livro2.titulo = "O Pequeno Príncipe";
        livro2.autor = "Antoine de Saint-Exupéry";
        livro2.numeroPaginas = 96;

        // Terceiro livro
        Livro livro3 = new Livro();

        livro3.titulo = "A Metamorfose";
        livro3.autor = "Franz Kafka";
        livro3.numeroPaginas = 128;

        // Abrindo e fechando os livros
        livro1.abrirLivro();
        livro1.fecharLivro();

        livro2.abrirLivro();

        livro3.abrirLivro();
        livro3.fecharLivro();

        // Exibindo detalhes
        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();
    }
}
