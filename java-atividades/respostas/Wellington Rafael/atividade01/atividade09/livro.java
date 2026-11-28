package atividade09;

public class livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean emprestado;

    public void emprestarLivro() {
        if (!emprestado) {
        System.out.println("O livro \"" + titulo + "\" foi emprestado.");
        } else {
        System.out.println("O livro \"" + titulo + "\" já está emprestado.");}
    }
    
    public void devolverLivro() {
        if (emprestado) {
        System.out.println("O livro \"" + titulo + "\" foi devolvido.");
        } else {
        System.out.println("O livro \"" + titulo + "\" não estava emprestado.");}
    }

    public void mostrarEstado() {
        System.out.println("O livro \"" + titulo + "\" de " + autor + " com " + numeroPaginas + " páginas está: " + (emprestado ? " EMPRESTADO " : " DISPONÍVEL ") + ".");
    }
}
