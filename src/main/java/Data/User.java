package Data;

public class User {
    private String name;
    private int maxScore;
    private Settings settings;

    public User(String name, int maxScore, Settings settings) {
        if (name == null || name.isBlank() || name.isEmpty() || maxScore < 0 || settings == null)
            throw new IllegalArgumentException();

        this.name = name;
        this.maxScore = maxScore;
        this.settings = settings;
    }

    public User(String name) {
        if (name == null || name.isBlank() || name.isEmpty())
            throw new IllegalArgumentException();

        this.name = name;
        maxScore = 0;
        settings = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank())
            throw new IllegalArgumentException();

        this.name = name;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        if (maxScore < 0)
            throw new IllegalArgumentException();

        this.maxScore = maxScore;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        if (settings == null)
            throw new IllegalArgumentException();

        this.settings = settings;
    }

}
