package game;

public abstract class Location {
    protected abstract Enemy createEnemy();

    public void encounterPlayer() {
        Enemy enemy = createEnemy();
        enemy.attack();
    }
}