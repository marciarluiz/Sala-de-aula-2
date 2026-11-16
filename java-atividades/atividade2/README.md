## Atividades de Java — Programação Orientada a Objetos

## UML — Unified Modeling Language, Herança e Noções de Polimorfismo

## Orientações gerais
- Verifique todas as aulas antes de iniciar as atividades.
- Desenvolva cada atividade utilizando as três classes Java especificadas.
- Utilize uma classe adicional chamada Main exclusivamente para criar objetos e testar os métodos.
- Utilize a palavra-chave extends para implementar herança.
- Utilize super nos construtores das subclasses para inicializar os atributos herdados.
- Aplique encapsulamento utilizando atributos private e métodos get e set, quando necessários.
- Utilize @Override para identificar os métodos sobrescritos.
- Crie os objetos individualmente no método main, sem utilizar vetores ou listas de objetos.
- Não será necessário utilizar referências da superclasse para demonstrar polimorfismo.
- Elabore um diagrama UML de classes para cada atividade, apresentando o nome das classes, atributos com seus tipos, métodos com parâmetros e tipos de retorno, modificadores de visibilidade (+, -, #) e relacionamentos de herança.
- Utilize o diagrams.net (draw.io), StarUML ou outra ferramenta de modelagem para elaborar os diagramas.
- Organize os arquivos Java e os diagramas UML em pastas identificadas pelo número de cada atividade.
- Teste os programas e verifique se as regras estabelecidas estão sendo respeitadas.

## Atividade 1 — Sistema de Funcionários
Crie um sistema para cadastrar funcionários de uma empresa utilizando três classes:
- Funcionario — superclasse.
- Gerente — subclasse.
- Vendedor — subclasse.

# Atributos:
Classe Funcionario:
- nome
- salario
Classe Gerente:
- bonus
Classe Vendedor:
- comissao

# Métodos:
- calcularSalario()
- exibirDados()
  
# Instruções:
1. Implemente as três classes utilizando herança com extends.
2. Utilize construtores para inicializar os atributos.
3. Aplique encapsulamento utilizando private.
4. Sobrescreva o método calcularSalario() nas classes Gerente e Vendedor utilizando @Override.
5. O gerente deverá receber o salário acrescido do bônus.
6. O vendedor deverá receber o salário acrescido da comissão.
7. No método main, crie um objeto da classe Gerente e outro da classe Vendedor.
8. Execute os métodos e apresente os salários calculados no terminal.
UML: desenhe o diagrama de classes contendo as três classes, seus atributos, métodos, modificadores de visibilidade e relacionamentos de herança.

## Atividade 2 — Sistema de Animais
Crie um sistema para representar diferentes animais utilizando três classes:
- Animal — superclasse.
- Cachorro — subclasse.
- Gato — subclasse.
  
# Atributos:
Classe Animal:
- nome
- idade
Classe Cachorro:
- raca
Classe Gato:
- cor

# Métodos:
- emitirSom()
- exibirDados()
  
## Instruções:
1. Implemente as três classes utilizando herança.
2. Utilize construtores para inicializar os atributos.
3. Aplique encapsulamento utilizando private.
4. Sobrescreva o método emitirSom() nas classes Cachorro e Gato utilizando @Override.
5. O cachorro deverá emitir a mensagem "Au au!".
6. O gato deverá emitir a mensagem "Miau!".
7. No método main, crie um objeto da classe Cachorro e outro da classe Gato.
8. Execute os métodos e apresente os dados dos animais no terminal.
UML: desenhe o diagrama de classes, identificando os atributos, métodos e relacionamentos de herança.

## Atividade 3 — Sistema de Veículos
Crie um sistema para representar diferentes tipos de veículos utilizando três classes:
- Veiculo — superclasse.
- Carro — subclasse.
- Moto — subclasse.

# Atributos:
Classe Veiculo:
- marca
- modelo
- ano
Classe Carro:
- numeroPortas
Classe Moto:
- cilindradas

# Métodos:
- ligar()
- exibirInformacoes()
Instruções:
1. Implemente as três classes utilizando herança.
2. Utilize construtores para inicializar os atributos.
3. Aplique encapsulamento utilizando private.
4. Sobrescreva o método ligar() nas classes Carro e Moto utilizando @Override.
5. O carro deverá apresentar a mensagem "Carro ligado!".
6. A moto deverá apresentar a mensagem "Moto ligada!".
7. No método main, crie um objeto da classe Carro e outro da classe Moto.
8. Execute os métodos e apresente as informações dos veículos no terminal.
UML: elabore o diagrama de classes com os atributos, métodos e relacionamentos de herança.

## Atividade 4 — Sistema de Produtos
Crie um sistema para controlar produtos de uma loja utilizando três classes:
- Produto — superclasse.
- ProdutoEletronico — subclasse.
- ProdutoAlimenticio — subclasse.

# Atributos:
Classe Produto:
- nome
- preco
Classe ProdutoEletronico:
- garantiaMeses
Classe ProdutoAlimenticio:
- dataValidade

# Métodos:
- calcularDesconto()
- exibirProduto()

## Instruções:
1. Implemente as três classes utilizando herança.
2. Utilize construtores para inicializar os atributos.
3. Aplique encapsulamento utilizando private.
4. Sobrescreva o método calcularDesconto() nas subclasses utilizando @Override.
5. Os produtos eletrônicos deverão receber desconto de 10%.
6. Os produtos alimentícios deverão receber desconto de 5%.
7. No método main, crie dois objetos da classe ProdutoEletronico e dois objetos da classe ProdutoAlimenticio.
8. Exiba o nome, o preço original, o desconto e o preço final de cada produto.
UML: construa o diagrama das três classes, identificando atributos, métodos e relacionamentos de herança.

## Atividade 5 — Sistema Bancário
Crie um sistema bancário utilizando três classes:
- ContaBancaria — superclasse.
- ContaCorrente — subclasse.
- ContaPoupanca — subclasse.

# Atributos:
Classe ContaBancaria:
- titular
- saldo
Classe ContaCorrente:
- taxaSaque
Classe ContaPoupanca:
- taxaRendimento

# Métodos:
- depositar(double valor)
- sacar(double valor)
- exibirSaldo()

# Instruções:
1. Implemente as três classes utilizando herança.
2. Utilize construtores para inicializar os atributos.
3. Aplique encapsulamento utilizando private.
4. Implemente o método depositar() na classe ContaBancaria.
5. Sobrescreva o método sacar() nas subclasses utilizando @Override.
6. Na conta corrente, cada saque deverá descontar também uma taxa fixa.
7. Na conta poupança, o saque deverá ocorrer sem cobrança de taxa.
8. No método main, crie um objeto da classe ContaCorrente e outro da classe ContaPoupanca.
9. Realize depósitos e saques e apresente os saldos atualizados.
UML: represente as três classes, seus atributos, métodos e relacionamentos de herança.

Regra: o saldo não poderá ficar negativo, e depósitos e saques deverão utilizar valores positivos.

# Atividade 6 — Sistema de Formas Geométricas
Crie um sistema para calcular áreas de figuras geométricas utilizando três classes:
- FormaGeometrica — superclasse abstrata.
- Circulo — subclasse.
- Retangulo — subclasse.

# Atributos:
Classe Circulo:
- raio
Classe Retangulo:
- base
- altura

# Métodos:
- calcularArea()
- exibirResultado()

# Instruções:
1. Crie a classe abstrata FormaGeometrica.
2. Declare o método abstrato calcularArea(), com retorno do tipo double.
3. Implemente as classes Circulo e Retangulo utilizando extends.
4. Utilize construtores para inicializar os atributos das subclasses.
5. Aplique encapsulamento utilizando private.
6. Sobrescreva o método calcularArea() nas duas subclasses utilizando @Override.
7. Para o círculo, utilize a fórmula: área = π × raio².
8. Para o retângulo, utilize a fórmula: área = base × altura.
9. No método main, crie um objeto da classe Circulo e outro da classe Retangulo.
10. Utilize o método exibirResultado() para apresentar as áreas calculadas.
UML: desenhe o diagrama de classes, identificando a classe abstrata, as subclasses, os atributos, os métodos e os relacionamentos de herança.

## Atividade 7 — Sistema de Biblioteca
Crie um sistema para representar diferentes materiais de uma biblioteca utilizando três classes:
- MaterialBiblioteca — superclasse.
- Livro — subclasse.
- Revista — subclasse.

# Atributos:
Classe MaterialBiblioteca:
- titulo
- anoPublicacao
Classe Livro:
- autor
Classe Revista:
- edicao

# Métodos:
- exibirInformacoes()
- calcularPrazoEmprestimo()

# Instruções:
1. Implemente as três classes utilizando herança.
2. Utilize construtores para inicializar os atributos.
3. Aplique encapsulamento utilizando private.
4. Sobrescreva o método calcularPrazoEmprestimo() nas subclasses utilizando @Override.
5. Os livros poderão ser emprestados por 14 dias.
6. As revistas poderão ser emprestadas por 7 dias.
7. No método main, crie dois objetos da classe Livro e dois objetos da classe Revista.
8. Apresente as informações e os prazos de empréstimo de cada material.
UML: represente as classes, seus atributos, métodos e relacionamentos de herança.

## Atividade 8 — Sistema de Pagamentos
Crie um sistema para representar diferentes formas de pagamento utilizando três classes:
- Pagamento — superclasse.
- PagamentoPix — subclasse.
- PagamentoCartao — subclasse.

# Atributos:
Classe Pagamento:
- valor
Classe PagamentoPix:
- chavePix
Classe PagamentoCartao:
- numeroParcelas

# Métodos:
- processarPagamento()
- exibirComprovante()
  
# Instruções:
1. Implemente as três classes utilizando herança.
2. Utilize construtores para inicializar os atributos.
3. Aplique encapsulamento utilizando private.
4. Sobrescreva o método processarPagamento() nas subclasses utilizando @Override.
5. No pagamento por Pix, apresente a mensagem "Pagamento via Pix realizado".
6. No pagamento por cartão, apresente a mensagem "Pagamento via cartão realizado".
7. No método main, crie um objeto da classe PagamentoPix e outro da classe PagamentoCartao.
8. Execute os métodos e apresente os comprovantes no terminal.
UML: elabore o diagrama de classes com os atributos, métodos e relacionamentos de herança.

## Atividade 9 — Sistema de Dispositivos Eletrônicos
Crie um sistema para controlar dispositivos eletrônicos utilizando três classes:
- Dispositivo — superclasse.
- Televisao — subclasse.
- Computador — subclasse.

# Atributos:
Classe Dispositivo:
- marca
- ligado
Classe Televisao:
- canal
Classe Computador:
- sistemaOperacional

# Métodos:
- ligar()
- desligar()
- exibirEstado()

# Instruções:
1. Implemente as três classes utilizando herança.
2. Utilize construtores para inicializar os atributos.
3. Aplique encapsulamento utilizando private.
4. Implemente os métodos ligar() e desligar() na classe Dispositivo.
5. Sobrescreva o método ligar() nas subclasses utilizando @Override.
6. Ao ligar a televisão, apresente a mensagem "Televisão ligada no canal informado".
7. Ao ligar o computador, apresente a mensagem "Computador iniciando o sistema operacional".
8. No método main, crie um objeto da classe Televisao e outro da classe Computador.
9. Demonstre o funcionamento dos métodos ligar(), desligar() e exibirEstado().
UML: construa o diagrama de classes, identificando atributos, métodos, modificadores de visibilidade e relacionamentos de herança.

# Atividade 10 — Sistema de Transporte
Crie um sistema para representar diferentes meios de transporte utilizando três classes:
- Transporte — superclasse.
- Onibus — subclasse.
- Bicicleta — subclasse.

# Atributos:
Classe Transporte:
- modelo
- capacidadePassageiros
Classe Onibus:
- tarifa
Classe Bicicleta:
- tipo

# Métodos:
- mover()
- exibirInformacoes()
  
# Instruções:
1. Implemente as três classes utilizando herança.
2. Utilize construtores para inicializar os atributos.
3. Aplique encapsulamento utilizando private.
4. Sobrescreva o método mover() nas subclasses utilizando @Override.
5. O ônibus deverá apresentar a mensagem "Ônibus transportando passageiros".
6. A bicicleta deverá apresentar a mensagem "Bicicleta em movimento".
7. No método main, crie dois objetos da classe Onibus e dois objetos da classe Bicicleta.
8. Execute os métodos e apresente as informações de cada objeto no terminal.
UML: represente as três classes em um diagrama, identificando atributos, métodos, modificadores de visibilidade e relacionamentos de herança.

## Atividade 11 — Estilo FCC — 2020
Na programação orientada a objetos, uma classe pode ser compreendida como:
a)	Uma instância específica criada durante a execução do programa.
b)	Um modelo que define atributos e comportamentos de objetos.
c)	Uma variável utilizada exclusivamente para armazenar números.
d)	Um banco de dados relacional.
e)	Um algoritmo que não possui atributos.

## Atividade  12 — Estilo FGV — 2023
Considere um sistema bancário em que a classe ContaBancaria possui o atributo saldo, cujo valor somente pode ser alterado por meio dos métodos depositar() e sacar().
Essa abordagem representa principalmente o conceito de:
a)	Herança.
b)	Polimorfismo.
c)	Encapsulamento.
d)	Sobrecarga.
e)	Generalização.

## Atividade  13 — Estilo VUNESP — 2022
Em um sistema de gerenciamento escolar, as classes Professor e Aluno compartilham atributos como nome e cpf, definidos em uma classe Pessoa.
Esse relacionamento caracteriza:
a)	Composição.
b)	Dependência.
c)	Associação simples.
d)	Agregação.
e)	Herança.

## Atividade 14 — Estilo Instituto AOCP — 2024
Em um sistema orientado a objetos, as classes Cachorro e Gato apresentam implementações diferentes do método emitirSom().
O conceito que permite que a mesma operação apresente comportamentos diferentes conforme o objeto é denominado:
a)	Polimorfismo.
b)	Normalização.
c)	Decomposição funcional.
d)	Persistência de dados.
e)	Indexação.

## Atividade 15 — Estilo Cebraspe — 2021
A Unified Modeling Language (UML) é amplamente utilizada na modelagem de sistemas orientados a objetos.
Sobre a UML, assinale a alternativa correta.
a)	É uma linguagem de programação utilizada para substituir Java e Python.
b)	É utilizada exclusivamente para criar bancos de dados relacionais.
c)	É uma ferramenta destinada apenas à construção de interfaces gráficas.
d)	É uma linguagem visual padronizada utilizada para especificar, visualizar e documentar sistemas.
e)	É um compilador que transforma diagramas diretamente em programas executáveis.

## Atividade 16 — Estilo FCC — 2022
Em um diagrama de classes UML, os símbolos +, - e # representam, respectivamente:
a)	Privado, público e protegido.
b)	Público, privado e protegido.
c)	Protegido, público e privado.
d)	Público, protegido e privado.
e)	Privado, protegido e público.

## Atividade 17 — Estilo FGV — 2023
Considere a seguinte representação de uma classe UML:
Aluno
- nome : String
- matricula : int
+ getNome() : String
+ estudar() : void
Com base nessa representação, é correto afirmar que:
a)	Os atributos nome e matricula são públicos.
b)	O método estudar() retorna obrigatoriamente um texto.
c)	Os atributos são privados e os métodos apresentados são públicos.
d)	A classe não possui atributos.
e)	O método getNome() é privado e não retorna valores.

## Atividade 18 — Estilo VUNESP — 2024
Em um sistema de biblioteca, uma classe Usuario está relacionada à classe Emprestimo. Um usuário pode realizar vários empréstimos, enquanto cada empréstimo pertence a um único usuário.
Em um diagrama de classes UML, a multiplicidade mais adequada para esse relacionamento, considerando que um usuário pode não ter realizado nenhum empréstimo, é:
a)	1 para 0..*.
b)	1 para 1.
c)	0..1 para 0..1.
d)	* para *, obrigatoriamente.
e)	1 para 1..1, exclusivamente.

## Atividade 19 — Estilo Instituto Quadrix — 2023
A UML possui diferentes tipos de diagramas utilizados para representar aspectos estruturais e comportamentais dos sistemas.
Assinale a alternativa que relaciona corretamente os diagramas às suas finalidades.
a)	Diagrama de classes: representa exclusivamente a sequência temporal de mensagens.
b)	Diagrama de casos de uso: representa apenas os atributos privados das classes.
c)	Diagrama de sequência: representa exclusivamente a estrutura física do banco de dados.
d)	Diagrama de atividades: representa somente a herança entre classes.
e)	Diagrama de casos de uso: representa funcionalidades e atores; diagrama de classes: representa classes e relacionamentos; diagrama de sequência: representa interações ao longo do tempo.

## Atividade 20 - Considere o código Java a seguir:

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

# Com base nos conceitos de Programação Orientada a Objetos e no funcionamento do código apresentado, assinale a alternativa correta.

a) O código apresenta erro de compilação, pois uma subclasse não pode possuir um método com o mesmo nome da superclasse.
b) A classe Cachorro herda da classe Animal e sobrescreve o método emitirSom(), fazendo com que a mensagem "Au au!" seja exibida.
c) A palavra-chave extends é utilizada para criar objetos da classe Animal.
d) A anotação @Override impede que o método emitirSom() seja executado na subclasse.
e) O programa exibirá a mensagem "Som de animal", pois os métodos da superclasse sempre possuem prioridade sobre os métodos das subclasses.


