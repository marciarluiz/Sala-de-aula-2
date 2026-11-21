package atividade2;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Ana";
        a1.idade = 19;
        a1.curso = "Análise e Desenvolvimento de Sistemas";
        a1.matricula = "2026001";

        Aluno a2 = new Aluno();
        a2.nome = "Bruno";
        a2.idade = 21;
        a2.curso = "Ciência da Computação";
        a2.matricula = "2026002";

        Aluno a3 = new Aluno();
        a3.nome = "Carla";
        a3.idade = 20;
        a3.curso = "Sistemas de Informação";
        a3.matricula = "2026003";

        a1.exibirDados();
        a2.exibirDados();
        a3.exibirDados();
    }
}
