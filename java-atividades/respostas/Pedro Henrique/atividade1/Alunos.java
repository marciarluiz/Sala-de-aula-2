package atividade1;

public class Alunos {

    // Atributos
    String nome;
    int idade;
    String curso;
    int matricula;

    // Método para exibir os dados
    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Primeiro objeto
        Alunos aluno1 = new Alunos();

        aluno1.nome = "João";
        aluno1.idade = 20;
        aluno1.curso = "ADS";
        aluno1.matricula = 101;

        // Segundo objeto
        Alunos aluno2 = new Alunos();

        aluno2.nome = "Maria";
        aluno2.idade = 22;
        aluno2.curso = "Direito";
        aluno2.matricula = 102;

        // Terceiro objeto
        Alunos aluno3 = new Alunos();

        aluno3.nome = "Pedro";
        aluno3.idade = 19;
        aluno3.curso = "Engenharia";
        aluno3.matricula = 103;

        // Exibindo os dados
        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
