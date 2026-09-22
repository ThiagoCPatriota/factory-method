package game;

public class MutantAnimal implements Enemy {
    @Override
    public void attack() {
        System.out.println("Animal mutante ataca o jogador!");
    }
}