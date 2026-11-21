package atividade2.QUESTÕES;

/*Na programação orientada a objetos, uma classe pode ser compreendida como:

// questão 11

Alternativa correta: B

b) Um modelo que define atributos e comportamentos de objetos.

Explicação:

Uma classe funciona como um molde para criar objetos. */

// exemplo 

/* ---EXEMPLO---

public class Pessoa {

    String nome;
    int idade;

} 
    
*/

// ------------------------------------------------------------------------------------------------------------------------

/*O atributo saldo somente pode ser alterado por meio dos métodos depositar() e sacar().

// questão 12

Alternativa correta: C

c) Encapsulamento.

Explicação:

O encapsulamento protege os atributos da classe, impedindo que sejam acessados diretamente quando declarados como private. */

/* ---EXEMPLO---

private double saldo;

Para alterar o saldo, usamos métodos como:

public void depositar(double valor) {
    saldo += valor;
}

*/

// ----------------------------------------------------------------------------------------------------------------------------

/*rofessor e Aluno compartilham atributos definidos em uma classe Pessoa.

// questão 13

Alternativa correta: E

e) Herança.

Explicação:

Professor e Aluno podem herdar os atributos de Pessoa.

*/

/* ---EXEMPLO---

public class Pessoa {
    String nome;
    String cpf;
}

public class Professor extends Pessoa {
}

public class Aluno extends Pessoa {
}


*/

// ------------------------------------------------------------------------------------------------------------------------------

/*Cachorro e Gato apresentam implementações diferentes do método emitirSom().

// questão 14

Alternativa correta: A

a) Polimorfismo.

Explicação:

Polimorfismo permite que um mesmo método tenha comportamentos diferentes dependendo do objeto. */

/* ---EXEMPLO---


class Animal {
    public void emitirSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

*/

// ------------------------------------------------------------------------------------------------------------------------------


/* 
Sobre a UML, assinale a alternativa correta.

// questão 15

Alternativa correta: D

d) É uma linguagem visual padronizada utilizada para especificar, visualizar e documentar sistemas.

Explicação:

UML significa Unified Modeling Language.

É utilizada para representar visualmente a estrutura e o funcionamento de sistemas.

Exemplo: diagramas de classes, casos de uso e sequência.  */

// -----------------------------------------------------------------------------------------------------------------------------

/*

Em um diagrama de classes UML, os símbolos +, - e # representam, respectivamente:

// questão 16

Alternativa correta: B

b) Público, privado e protegido.

Explicação:
Símbolo    	Visibilidade	  Java
+	            Públic  	  public
-	            Privado	      private
#	            Protegido	  protected

*/

/* 

// ------------------------------------------------------------------------------------------------------------------------------

Alternativa correta: C

// questão 17

c) Os atributos são privados e os métodos apresentados são públicos.

Explicação:

Observe os símbolos:
- - nome: atributo privado.
- - matricula: atributo privado.
- + getNome(): método público.
- + estudar(): método público.
Além disso:
- String: tipo de texto.
- int: número inteiro.
- void: método que não retorna valor.

REPRESENTAÇÃO DA CLASSE ALUNO: 

Aluno

- nome : String
- matricula : int

+ getNome() : String
+ estudar() : void

*/

// -----------------------------------------------------------------------------------------------------------------------------

/*

Um usuário pode realizar vários empréstimos, enquanto cada empréstimo pertence a um único usuário.

// questão 18

Alternativa correta: A

a) 1 para 0..*

Explicação:

A multiplicidade representa quantas vezes um objeto pode estar relacionado a outro.
- 1: cada empréstimo pertence a exatamente um usuário.
- 0..*: um usuário pode ter nenhum empréstimo ou vários empréstimos.

*/

// ---------------------------------------------------------------------------------------------------------------------------

/*

Sobre os diagramas UML e suas finalidades:

// questão 19

Alternativa correta: E

e) Diagrama de casos de uso: representa funcionalidades e atores; diagrama de classes: representa classes e relacionamentos; diagrama de sequência: representa interações ao longo do tempo.

Explicação:

Existem diferentes diagramas UML:
Diagrama	O que representa
Casos de uso	Atores e funcionalidades do sistema.
Classes	Classes, atributos, métodos e relacionamentos.
Sequência	Interações entre objetos ao longo do tempo.
Atividades	Fluxo de atividades e processos.

*/

// ----------------------------------------------------------------------------------------------------------------------------

/*

b) A classe Cachorro herda da classe Animal e sobrescreve o método emitirSom(), fazendo com que a mensagem "Au au!" seja exibida.

// questão 20

Explicação:
1. Cachorro extends Animal: Cachorro herda de Animal.
2. @Override: indica que o método está sendo sobrescrito.
3. cachorro.emitirSom(): executa a versão do método que está na classe Cachorro.


--- EXEMPLO NO CÓDIGO ---

class Animal {

    public void emitirSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();
    }
}

*/