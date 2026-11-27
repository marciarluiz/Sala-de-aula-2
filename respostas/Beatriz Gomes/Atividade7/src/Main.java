public class Main {
    
    public static void main(String[] args) {
        // Criando o primeiro aluno
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Lucas";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 7.5;

        // Criando o segundo aluno
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Camila";
        aluno2.nota1 = 5.5;
        aluno2.nota2 = 6.0;

        // Exibindo os resultados dos dois alunos
        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}

