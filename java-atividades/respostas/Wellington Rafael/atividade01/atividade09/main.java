package atividade09;

public class main {
    public static void main(String[] args) {
        livro livro1 = new livro();
        livro1.titulo = "O Senhor dos Anéis";
        livro1.autor = "J.R.R. Tolkien";
        livro1.numeroPaginas = 1178;
        livro1.emprestado = false;

        livro livro2 = new livro();
        livro2.titulo = "1984";
        livro2.autor = "George Orwell";
        livro2.numeroPaginas = 328;
        livro2.emprestado = true;

        livro livro3 = new livro();
        livro3.titulo = "O Pequeno Príncipe";
        livro3.autor = "Antoine de Saint-Exupéry";
        livro3.numeroPaginas = 96;
        livro3.emprestado = false;

        livro1.mostrarEstado();
        livro2.mostrarEstado();
        livro3.mostrarEstado();

        System.out.println();
        livro1.emprestarLivro();
        livro2.emprestarLivro();
        livro3.emprestarLivro();



    } 
}
