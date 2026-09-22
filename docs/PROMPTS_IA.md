# Registro do uso de IA

Este arquivo registra uma sequência de prompts coerente com a evolução mostrada no histórico de commits. A proposta é usar a IA como orientação passo a passo, mantendo cada mudança pequena e justificável.

## Etapa 1 — Estrutura inicial

**Prompt:**

> Tenho uma atividade sobre o padrão Factory Method em Java. O cenário é um jogo com localizações brasileiras. Na Amazônia, os inimigos são animais mutantes; no Sertão, os inimigos são cangaceiros. No futuro, novas localizações podem ser adicionadas. Não resolva tudo de uma vez. Primeiro, proponha uma estrutura mínima de projeto Java para desenvolver a solução em etapas, sem implementar ainda o padrão completo.

**Resultado/decisão:** foi criada apenas a estrutura mínima do projeto e a documentação inicial.

## Etapa 2 — Produto abstrato

**Prompt:**

> Agora implemente somente a abstração comum dos inimigos. Todo inimigo precisa atacar o jogador. Use uma interface simples e pare depois dessa etapa.

**Resultado/decisão:** foi criada a interface `Enemy`, com o método `attack()`.

## Etapa 3 — Produtos concretos

**Prompt:**

> Com base na interface Enemy já criada, implemente somente os dois inimigos necessários nesta versão: um animal mutante para a Amazônia e um cangaceiro para o Sertão. Cada um deve implementar attack() e imprimir uma mensagem simples.

**Resultado/decisão:** foram criados `MutantAnimal` e `Cangaceiro`.

## Etapa 4 — Creator e Factory Method

**Prompt:**

> Agora introduza o Factory Method. Crie uma classe abstrata que represente uma localização do jogo. Ela deve declarar um método fábrica para criar Enemy e possuir um método comum que obtenha o inimigo pela fábrica e mande-o atacar. Não crie ainda as localizações concretas.

**Resultado/decisão:** foi criada `Location`, com `createEnemy()` como Factory Method e `encounterPlayer()` como fluxo comum.

## Etapa 5 — Concrete Creators

**Prompt:**

> Implemente agora as localizações concretas Amazônia e Sertão. Cada uma deve sobrescrever somente o Factory Method e retornar o inimigo adequado. Não coloque condicionais de tipo dentro da classe Location.

**Resultado/decisão:** foram criadas `AmazonLocation` e `SertaoLocation`, mantendo `Location` desacoplada das classes concretas.

## Etapa 6 — Simulação

**Prompt:**

> Crie uma classe Main bem simples para simular o jogador entrando primeiro na Amazônia e depois no Sertão. A simulação deve mostrar que, independentemente da localização, há um inimigo que ataca o jogador. Não acrescente regras que não foram pedidas no enunciado.

**Resultado/decisão:** a simulação instancia as duas localizações e chama o mesmo fluxo `encounterPlayer()`.

## Etapa 7 — Diagrama

**Prompt:**

> Gere um diagrama de classes simples para a solução, indicando os papéis de Product, Concrete Product, Creator, Factory Method e Concrete Creator. O diagrama deve representar apenas as classes necessárias para ilustrar o padrão.

**Resultado/decisão:** foi criado um diagrama enxuto, preservando a simplicidade exigida pelo exercício.

## Ajustes feitos sobre a orientação da IA

- Mantivemos apenas duas localizações implementadas, porque o Rio de Janeiro é citado apenas como possibilidade futura no enunciado.
- Não foi criado `if`, `switch` ou enum central para decidir o inimigo. Isso concentraria a escolha em um ponto e reduziria o benefício do Factory Method.
- O método `encounterPlayer()` ficou em `Location`, garantindo que o fluxo do jogo dependa apenas da abstração `Enemy`.
- As mensagens e a simulação foram mantidas simples, porque o exercício pede artefatos mínimos voltados à demonstração do padrão.
