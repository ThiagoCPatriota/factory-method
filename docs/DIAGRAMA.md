# Diagrama de Classes — Factory Method

```mermaid
classDiagram
    class Enemy {
        <<interface>>
        +attack() void
    }

    class MutantAnimal {
        +attack() void
    }

    class Cangaceiro {
        +attack() void
    }

    class Location {
        <<abstract>>
        #createEnemy() Enemy
        +encounterPlayer() void
    }

    class AmazonLocation {
        #createEnemy() Enemy
    }

    class SertaoLocation {
        #createEnemy() Enemy
    }

    Enemy <|.. MutantAnimal
    Enemy <|.. Cangaceiro
    Location <|-- AmazonLocation
    Location <|-- SertaoLocation
    Location ..> Enemy : cria/usa
    AmazonLocation ..> MutantAnimal : instancia
    SertaoLocation ..> Cangaceiro : instancia
```

## Papéis no padrão

- **Product:** `Enemy`
- **Concrete Products:** `MutantAnimal` e `Cangaceiro`
- **Creator:** `Location`
- **Factory Method:** `createEnemy()`
- **Concrete Creators:** `AmazonLocation` e `SertaoLocation`

A classe `Location` controla o fluxo do confronto, mas não instancia diretamente um inimigo concreto. Cada subclasse escolhe o produto adequado sobrescrevendo `createEnemy()`.

Para adicionar futuramente o Rio de Janeiro, basta criar um novo `Enemy` (por exemplo, o inimigo da fase) e uma nova subclasse de `Location`; o fluxo `encounterPlayer()` permanece inalterado.
