# ☕ Atividades de Java — Programação Orientada a Objetos

## Atividade 1 — Conta Bancária

Crie uma classe chamada `ContaBancaria`.

**Atributos:**
- `titular`
- `numeroConta`
- `saldo`

**Métodos:**
- `depositar()`
- `sacar()`
- `exibirSaldo()`

**Instruções:**

1. Implemente a classe `ContaBancaria` com os atributos e métodos especificados.
2. No método `main`, crie um objeto da classe.
3. Realize operações de depósito e saque e exiba o saldo atualizado.

**Exemplo de criação do objeto:**

```java
ContaBancaria conta1 = new ContaBancaria();
```

**Questão:** como você implementaria essa classe?

---

## Atividade 2 — Cadastro de Alunos

Crie uma classe chamada `Aluno` com os seguintes atributos:

- `nome`
- `idade`
- `curso`

**Instruções:**

1. Crie três objetos da classe `Aluno`.
2. Atribua informações diferentes a cada aluno.
3. Implemente o método `exibirDados()`.
4. Exiba os dados dos três alunos no terminal.

**Desafio:** adicione o atributo `matricula` à classe e apresente essa informação junto aos demais dados.

---

## Atividade 3 — Cadastro de Veículos

Crie uma classe chamada `Carro` com os seguintes atributos:

- `modelo`
- `marca`
- `ano`
- `ligado`

**Métodos:**
- `ligar()`
- `desligar()`
- `exibirInformacoes()`

**Instruções:**

1. Crie dois objetos da classe `Carro`.
2. Implemente os métodos especificados.
3. No método `main`, demonstre o funcionamento dos métodos para os dois carros.

**Desafio:** impeça que um carro seja ligado duas vezes consecutivas sem antes ser desligado.

---

## Atividade 4 — Sistema de Produtos

Crie uma classe chamada `Produto` com os seguintes atributos:

- `nome`
- `preco`
- `quantidade`

**Métodos:**
- `calcularValorEstoque()`
- `exibirProduto()`

**Instruções:**

1. Utilize um construtor para inicializar os dados dos produtos.
2. Implemente o método `calcularValorEstoque()`, que deverá calcular o valor total do estoque do produto.
3. Implemente o método `exibirProduto()`, que deverá apresentar as informações do produto.
4. Cadastre três produtos diferentes e exiba seus dados.

**Desafio:** implemente um método para aplicar descontos percentuais ao preço do produto.

---

## Atividade 5 — Cadastro de Celulares

Crie uma classe chamada `Celular` com os seguintes atributos:

- `marca`
- `modelo`
- `bateria`

**Métodos:**
- `ligar()`
- `exibirInformacoes()`
- `carregarBateria()`

**Instruções:**

1. Crie dois objetos da classe `Celular`.
2. Atribua informações diferentes a cada celular.
3. Apresente as informações dos dois aparelhos.
4. Simule o carregamento da bateria de cada celular.

---

## Atividade 6 — Cadastro de Animais

Crie uma classe chamada `Cachorro` com os seguintes atributos:

- `nome`
- `raca`
- `idade`

**Métodos:**
- `latir()`
- `brincar()`
- `exibirDados()`

**Instruções:**

1. Crie três objetos da classe `Cachorro`.
2. Atribua informações diferentes a cada cachorro.
3. Execute os métodos para cada objeto.
4. Exiba os dados dos três animais no terminal.

---

## Atividade 7 — Alunos e Notas

Crie uma classe chamada `Aluno` com os seguintes atributos:

- `nome`
- `nota1`
- `nota2`

**Métodos:**
- `calcularMedia()`
- `exibirResultado()`

**Instruções:**

1. Crie dois objetos da classe `Aluno`.
2. Atribua o nome e as duas notas de cada aluno.
3. Calcule a média de cada aluno utilizando o método `calcularMedia()`.
4. Utilize o método `exibirResultado()` para apresentar o nome, a média e a situação de cada aluno.

**Regra:** o aluno será considerado aprovado quando obtiver média maior ou igual a 7,0. Caso contrário, será considerado reprovado.

---

## Atividade 8 — Lâmpada Inteligente

Crie uma classe chamada `Lampada` com os seguintes atributos:

- `cor`
- `potencia`
- `ligada`

**Métodos:**
- `ligar()`
- `desligar()`
- `mostrarEstado()`

**Instruções:**

1. Crie dois objetos da classe `Lampada`.
2. Atribua informações diferentes a cada lâmpada.
3. Configure uma lâmpada para estar ligada e a outra para estar desligada.
4. Utilize o método `mostrarEstado()` para demonstrar o funcionamento das duas lâmpadas.

---

## Atividade 9 — Cadastro de Livros

Crie uma classe chamada `Livro` com os seguintes atributos:

- `titulo`
- `autor`
- `numeroPaginas`

**Métodos:**
- `abrirLivro()`
- `fecharLivro()`
- `mostrarDetalhes()`

**Instruções:**

1. Cadastre três livros diferentes, criando três objetos da classe `Livro`.
2. Atribua as informações de cada livro.
3. Utilize o método `mostrarDetalhes()` para apresentar os dados dos livros.
4. Demonstre o funcionamento dos métodos `abrirLivro()` e `fecharLivro()`.

---

## Atividade 10 — Calculadora

Crie uma classe chamada `Calculadora` com os seguintes métodos:

- `somar(double a, double b)`
- `subtrair(double a, double b)`
- `multiplicar(double a, double b)`
- `dividir(double a, double b)`

**Instruções:**

1. Implemente os quatro métodos, retornando o resultado de cada operação.
2. No método `main`, crie um objeto da classe `Calculadora`.
3. Realize as operações de adição, subtração, multiplicação e divisão.
4. Exiba os resultados no terminal.

**Desafio:** trate a divisão por zero, impedindo que a operação seja realizada quando o divisor for igual a zero.

---

## Atividade 11 — Controle de Televisão

Crie uma classe chamada `Televisao` com os seguintes atributos:

- `marca`
- `volume`
- `canal`

**Métodos:**
- `aumentarVolume()`
- `diminuirVolume()`
- `mudarCanal(int novoCanal)`

**Instruções:**

1. Crie um objeto da classe `Televisao`.
2. Atribua valores iniciais aos seus atributos.
3. Simule o usuário aumentando e diminuindo o volume e mudando de canal.
4. Exiba as informações atualizadas da televisão.

**Regra:** o volume deverá permanecer entre 0 e 100. Implemente verificações para impedir que esse limite seja ultrapassado.

---

## Atividade 12 — Controle de Estoque

Crie uma classe chamada `Produto` com os seguintes atributos:

- `nome`
- `preco`
- `quantidade`

**Métodos:**
- `adicionarEstoque(int quantidade)`
- `retirarEstoque(int quantidade)`
- `mostrarEstoque()`

**Instruções:**

1. Crie dois objetos da classe `Produto`.
2. Atribua informações diferentes a cada produto.
3. Realize operações de entrada e saída de estoque.
4. Utilize o método `mostrarEstoque()` para apresentar as quantidades atualizadas.

**Regra:** impeça que a quantidade em estoque fique negativa.

---

## Atividade 13 — Controle de Temperatura

Crie uma classe chamada `ArCondicionado` com os seguintes atributos:

- `marca`
- `temperatura`
- `ligado`

**Métodos:**
- `ligar()`
- `desligar()`
- `aumentarTemperatura()`
- `diminuirTemperatura()`

**Instruções:**

1. Crie um objeto da classe `ArCondicionado`.
2. Atribua valores iniciais aos atributos.
3. Demonstre o funcionamento dos métodos para ligar e desligar o aparelho.
4. Aumente e diminua a temperatura, exibindo os valores atualizados.

**Regra:** a temperatura deverá permanecer entre 16 °C e 30 °C. Implemente verificações para impedir que os limites sejam ultrapassados.

---

## Orientações gerais

- Desenvolva cada atividade em uma classe própria.
- Utilize o método `main` para criar objetos e testar os métodos, conforme solicitado.
- Utilize nomes de classes, atributos e métodos seguindo as convenções da linguagem Java.
- Organize e identifique os arquivos de cada atividade.
- Teste o funcionamento dos métodos e verifique se as regras estabelecidas estão sendo respeitadas.
- Salve suas respostas na pasta identificada com seu nome, seguindo as instruções do repositório.
- prazo para entregar: até dia **05/11.**

**Bons estudos e boa programação!** 🚀
