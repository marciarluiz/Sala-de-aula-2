public class Main {
    public static void main(String[] args) {
        // Cadastrando três livros diferentes
        Livro livro1 = new Livro();
        livro1.titulo = "O Senhor dos Anéis";
        livro1.autor = "J.R.R. Tolkien";
        livro1.numeroPaginas = 1200;
        livro1.aberto = false;

        Livro livro2 = new Livro();
        livro2.titulo = "Dom Casmurro";
        livro2.autor = "Machado de Assis";
        livro2.numeroPaginas = 256;
        livro2.aberto = false;

        Livro livro3 = new Livro();
        livro3.titulo = "O Pequeno Príncipe";
        livro3.autor = "Antoine de Saint-Exupéry";
        livro3.numeroPaginas = 96;
        livro3.aberto = false;

        // Exibindo detalhes dos três livros cadastrados
        System.out.println("--- Detalhes Iniciais dos Livros ---");
        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();

        System.out.println("\n--- Simulando Interações com os Livros ---");
        
        // Testando o livro 1
        livro1.abrirLivro();
        livro1.abrirLivro(); // Tentando abrir de novo para ver a mensagem
        livro1.mostrarDetalhes();

        System.out.println();

        // Testando o livro 2
        livro2.abrirLivro();
        livro2.fecharLivro();
        livro2.mostrarDetalhes();
    }
}

