# Prática Factory Method - Jogo

Projeto da disciplina **Padrões de Projetos Orientados a Objetos** para demonstrar, de forma simples, o padrão **Factory Method** em Java.

O cenário será desenvolvido em etapas e possui localizações brasileiras. A implementação do padrão será construída gradualmente, mantendo cada mudança pequena e justificável.

## Estrutura inicial

```text
factory-method/
├── src/
│   └── game/
├── docs/
└── README.md
```

Até esta etapa, `src/game` contém a interface `Enemy` e os produtos concretos `MutantAnimal` e `Cangaceiro`. As próximas etapas adicionarão os demais elementos do domínio e do padrão na seguinte ordem:

1. creator e Factory Method;
2. localizações concretas;
3. simulação;
4. diagrama de classes.

## Documentação

- `docs/DIAGRAMA.md`: diagrama e explicação dos papéis do padrão, a ser atualizado ao final.
- `docs/PROMPTS_IA.md`: registro dos prompts e decisões tomadas ao longo da solução.
