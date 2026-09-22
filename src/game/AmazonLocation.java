package game;

public class AmazonLocation extends Location {
    @Override
    protected Enemy createEnemy() {
        return new MutantAnimal();
    }
}