class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    void abrirLivro() {
        System.out.println("Abrindo o livro \"" + titulo + "\".");
    }

    void fecharLivro() {
        System.out.println("Fechando o livro \"" + titulo + "\".");
    }

    void mostrarDetalhes() {
        System.out.println("Titulo: " + titulo + " | Autor: " + autor + " | Paginas: " + numeroPaginas);
    }
}

public class Atividade9 {
    public static void main(String[] args) {
        Livro liv1 = new Livro();
        liv1.titulo = "Java para Iniciantes";
        liv1.autor = "Herbert Schildt";
        liv1.numeroPaginas = 450;

        Livro liv2 = new Livro();
        liv2.titulo = "Codigo Limpo";
        liv2.autor = "Robert C. Martin";
        liv2.numeroPaginas = 425;

        Livro liv3 = new Livro();
        liv3.titulo = "Entendendo Algoritmos";
        liv3.autor = "Aditya Bhargava";
        liv3.numeroPaginas = 264;

        liv1.mostrarDetalhes();
        liv1.abrirLivro();
        liv1.fecharLivro();

        liv2.mostrarDetalhes();
        liv2.abrirLivro();
        liv2.fecharLivro();

        liv3.mostrarDetalhes();
        liv3.abrirLivro();
        liv3.fecharLivro();
    }
}