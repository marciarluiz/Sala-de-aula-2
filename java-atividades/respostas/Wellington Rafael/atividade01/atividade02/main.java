package atividade02;

public class main {

    public static void main(String[] args) {
        aluno aluno1 = new aluno();
        aluno1.nome = "Welligton";
        aluno1.idade = 20;
        aluno1.matricula = "201030";
        aluno1.curso = "ADS";
        aluno1.exibirDados();

        aluno aluno2 = new aluno();
        aluno2.nome = "Pedro";
        aluno2.idade = 21;
        aluno2.matricula = "201031";
        aluno2.curso = "ADS";
        aluno2.exibirDados();

        aluno aluno3 = new aluno();
        aluno3.nome = "João";
        aluno3.idade = 22;
        aluno3.matricula = "201032";
        aluno3.curso = "ADS";
        aluno3.exibirDados();

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }

}