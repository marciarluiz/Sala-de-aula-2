# Atividade 1 — Engenharia de Requisitos

## Orientações gerais

Cada aluno deverá acessar o repositório da disciplina, realizar um **Fork** e responder às questões em um arquivo Markdown (`.md`).

O arquivo deverá conter as respostas dos dois estudos de caso apresentados nesta atividade e ser salvo na pasta identificada com o nome do aluno, dentro do diretório `respostas`.

Após concluir a atividade, o aluno deverá enviar um **Pull Request** para o repositório original.

**Nome sugerido para o arquivo:** `atividade1.md`

Prazo para entrega: até o dia **30/10**.

---

## Estudo de Caso 1 — Conecta Campus

Uma universidade deseja centralizar seus serviços acadêmicos por meio do desenvolvimento do **Conecta Campus**.

Durante uma reunião inicial, foram levantadas as seguintes necessidades:

- Os alunos querem consultar notas, horários e receber avisos.
- Os professores querem publicar materiais e comunicados.
- A coordenação quer divulgar eventos e informações acadêmicas.
- Os alunos reclamam que o sistema atual é lento e difícil de usar.
- A universidade exige que as informações acadêmicas sejam acessadas somente por usuários autenticados.
- Alguns professores querem incluir um chat entre alunos e professores, mas a equipe acredita que essa funcionalidade pode atrasar a primeira versão.

Com base nesse cenário, responda às questões a seguir.

### 1. Concepção

Qual problema o Conecta Campus pretende resolver e qual é seu principal objetivo?

### 2. Elicitação

Quem são os principais stakeholders do sistema?

Quais técnicas poderiam ser utilizadas para identificar e compreender suas necessidades? Cite pelo menos duas técnicas e explique como seriam aplicadas.

### 3. Análise e modelagem

Identifique pelo menos:

- Cinco requisitos funcionais (RF).
- Três requisitos não funcionais (RNF).

Apresente os requisitos de forma clara, utilizando identificadores como `RF01`, `RF02`, `RNF01` e `RNF02`.

### 4. Negociação

Classifique os requisitos ou funcionalidades utilizando a técnica MoSCoW:

- **Must have:** indispensável.
- **Should have:** importante, mas não indispensável.
- **Could have:** desejável, caso haja recursos disponíveis.
- **Won't have:** não será implementado na versão atual.

Justifique suas escolhas, considerando as necessidades dos usuários e as limitações da primeira versão.

### 5. Especificação

A frase “O aplicativo deve ser rápido, seguro e fácil de usar” é vaga e não apresenta critérios objetivos de avaliação.

Transforme essa frase em requisitos não funcionais claros, mensuráveis e verificáveis.

Apresente pelo menos três requisitos e indique como cada um poderia ser testado.

### 6. Validação

Como a equipe poderia confirmar com alunos, professores e coordenação se os requisitos levantados estão corretos e representam suas necessidades?

Cite pelo menos duas técnicas de validação e explique como seriam aplicadas.

---

## Estudo de Caso 2 — PetCare

Uma clínica veterinária deseja desenvolver o **PetCare**, um sistema para melhorar o atendimento aos animais e organizar as informações dos clientes.

Atualmente, os agendamentos são realizados por telefone e WhatsApp. O histórico dos animais fica armazenado em fichas e arquivos separados, o que dificulta encontrar rapidamente informações sobre consultas anteriores, vacinas e medicamentos.

Os envolvidos apresentam as seguintes necessidades:

- **Tutores dos animais:** querem marcar consultas pelo celular e receber lembretes de vacinação.
- **Veterinários:** querem consultar o histórico do animal e registrar diagnósticos, tratamentos e medicamentos.
- **Recepção:** precisa controlar os horários disponíveis e confirmar ou cancelar consultas.
- **Gerência:** deseja visualizar relatórios sobre a quantidade de atendimentos realizados.

Durante a reunião, surgiram também outras solicitações:

- Permitir pagamentos pelo aplicativo.
- Disponibilizar um chat com o veterinário.
- Criar uma área para publicação de fotos dos animais.

O proprietário afirmou que o sistema deve ser “rápido, seguro e muito fácil de usar” e estabeleceu o prazo de quatro meses para disponibilizar a primeira versão.

Imagine que sua equipe foi contratada para realizar a Engenharia de Requisitos do PetCare.

### 1. Elicitação e stakeholders

Identifique os principais stakeholders do PetCare e explique quais são suas necessidades.

Em seguida, apresente pelo menos duas técnicas de elicitação que sua equipe utilizaria para descobrir e compreender essas necessidades. Justifique suas escolhas.

### 2. Análise e especificação de requisitos

Determine pelo menos:

- Cinco requisitos funcionais (RF).
- Três requisitos não funcionais (RNF).

Utilize identificadores para organizar os requisitos e descreva cada um de forma clara e verificável.

### 3. Negociação com MoSCoW

Classifique as funcionalidades do PetCare utilizando a técnica MoSCoW: Must, Should, Could e Won't.

Considere as necessidades dos stakeholders, o prazo de quatro meses e as limitações de recursos.

Justifique suas escolhas, especialmente em relação às funcionalidades de pagamento pelo aplicativo, chat com o veterinário e publicação de fotos dos animais.

### 4. Especificação de requisitos não funcionais

Transforme a frase “O sistema deve ser rápido, seguro e muito fácil de usar” em requisitos que possam ser medidos e testados.

Apresente pelo menos três requisitos não funcionais, incluindo critérios objetivos de avaliação e a forma de verificar se cada requisito foi atendido.

### 5. Validação dos requisitos

Explique como sua equipe faria a validação dos requisitos antes de iniciar o desenvolvimento.

Apresente pelo menos duas técnicas de validação e descreva como elas ajudariam a identificar erros, omissões ou divergências entre as expectativas dos stakeholders e os requisitos especificados.

### 6. Desafio — Priorização da primeira versão

O proprietário informa que existe orçamento para desenvolver apenas **cinco funcionalidades na primeira versão** do PetCare.

Escolha cinco funcionalidades prioritárias e justifique suas decisões.

Para cada funcionalidade escolhida, explique:

- Qual necessidade ela atende.
- Quem será beneficiado.
- Por que deve fazer parte da primeira versão.

Considere também os riscos de adiar as demais funcionalidades.

---

## Entrega da atividade

O arquivo `atividade1.md` deverá conter as respostas completas dos dois estudos de caso, organizadas de acordo com as questões apresentadas.

Antes de enviar o Pull Request, verifique se:

- Todas as questões foram respondidas.
- Os stakeholders foram identificados e suas necessidades foram descritas.
- Os requisitos funcionais e não funcionais estão identificados e especificados.
- A classificação MoSCoW apresenta justificativas coerentes.
- Os requisitos não funcionais possuem critérios verificáveis.
- As técnicas de elicitação e validação foram explicadas.
- As decisões de priorização foram justificadas.

**Critérios de avaliação:** compreensão das etapas da Engenharia de Requisitos, identificação dos stakeholders, qualidade da especificação, aplicação da técnica MoSCoW, adequação das técnicas de elicitação e validação e justificativa das decisões tomadas.

**Bons estudos!** 📚
