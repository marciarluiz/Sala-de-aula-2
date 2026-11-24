class Aluno {
    String nome;
    int idade;
    String curso;
    String matricula;

    void exibirDados() {
        System.out.println("Nome: " + nome + " | Matricula: " + matricula + " | Idade: " + idade + " | Curso: " + curso);
    }
}

public class Atividade2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Arthur";
        a1.idade = 18;
        a1.curso = "ADS";
        a1.matricula = "2026001";

        Aluno a2 = new Aluno();
        a2.nome = "Maria";
        a2.idade = 19;
        a2.curso = "ADS";
        a2.matricula = "2026002";

        Aluno a3 = new Aluno();
        a3.nome = "Lucas";
        a3.idade = 20;
        a3.curso = "Ciencia da Computacao";
        a3.matricula = "2026003";

        a1.exibirDados();
        a2.exibirDados();
        a3.exibirDados();
    }
}
    

