package Data.Difficulties;

public enum GameSpeed {
    FAST(3), MEDIUM(2), SLOW(1);

    int speed;
    GameSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

}
