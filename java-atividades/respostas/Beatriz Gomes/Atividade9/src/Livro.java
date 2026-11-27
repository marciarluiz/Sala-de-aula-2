public class Livro {
    // Atributos
    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto; // true para aberto, false para fechado

    // Método para abrir o livro
    void abrirLivro() {
        if (aberto) {
            System.out.println("O livro \"" + titulo + "\" já está aberto.");
        } else {
            aberto = true;
            System.out.println("Você abriu o livro \"" + titulo + "\". Boa leitura!");
        }
    }

    // Método para fechar o livro
    void fecharLivro() {
        if (!aberto) {
            System.out.println("O livro \"" + titulo + "\" já está fechado.");
        } else {
            aberto = false;
            System.out.println("Você fechou o livro \"" + titulo + "\".");
        }
    }

    // Método para mostrar os detalhes do livro
    void mostrarDetalhes() {
        String status = aberto ? "Aberto" : "Fechado";
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas + " | Status: " + status);
    }
}