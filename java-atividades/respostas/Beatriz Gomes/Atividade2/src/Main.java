public class Main {
    
    public static void main(String[] args) {
        // Criando o primeiro aluno
        CadastroAluno aluno1 = new CadastroAluno();
        aluno1.nome = "Beatriz";
        aluno1.idade = 17;
        aluno1.curso = "Desenvolvimento de Sistemas";

        // Criando o segundo aluno
        CadastroAluno aluno2 = new CadastroAluno();
        aluno2.nome = "Carlos";
        aluno2.idade = 18;
        aluno2.curso = "Administração";

        // Criando o terceiro aluno
        CadastroAluno aluno3 = new CadastroAluno();
        aluno3.nome = "Mariana";
        aluno3.idade = 16;
        aluno3.curso = "Informática";

        // Exibindo os dados dos três alunos
        aluno1.exibirAluno();
        aluno2.exibirAluno();
        aluno3.exibirAluno();
    }
}

