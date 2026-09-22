package game;

public class SertaoLocation extends Location {
    @Override
    protected Enemy createEnemy() {
        return new Cangaceiro();
    }
}