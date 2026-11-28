package atividade07;

public class main {
    public static void main(String [] args) {
        notas aluno1 = new notas();
        aluno1.nome = "Welligton";
        aluno1.nota1 = 7.5;
        aluno1.nota2 = 8.0;

        notas aluno2 = new notas();
        aluno2.nome = "Pedro";
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 6.0;

        notas aluno3 = new notas();
        aluno3.nome = "João";
        aluno3.nota1 = 4.0;
        aluno3.nota2 = 5.5;

        aluno1.exibirResultado();
        aluno2.exibirResultado();
        aluno3.exibirResultado();
    }
    
}
