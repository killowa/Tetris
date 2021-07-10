package Data.Difficulties;

public abstract class Difficulty {

    private final GameSpeed gameSpeed;
    private final boolean shadow;

    public Difficulty(GameSpeed gameSpeed, boolean shadow) {
        if (gameSpeed == null)
            throw new IllegalArgumentException();

        this.gameSpeed = gameSpeed;
        this.shadow = shadow;
    }

    public GameSpeed getGameSpeed() {
        return gameSpeed;
    }

    public boolean isShadow() {
        return shadow;
    }

}
