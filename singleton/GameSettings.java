package singleton;

public class GameSettings {
    private static GameSettings instance;
    private String screenResolution;
    private String difficulty;
    private int soundVolume;

    private GameSettings() {
        this.screenResolution = "1280x720";
        this.difficulty = "Easy";
        this.soundVolume = 50;

    }
    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }
    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;

    }
    public String getScreenResolution() {
        return screenResolution;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public String getDifficulty() {
        return difficulty;

    }
    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) soundVolume = 0;
        if (soundVolume > 100) soundVolume = 100;
        this.soundVolume = soundVolume;
    }
    public int getSoundVolume() {
        return soundVolume;
    }
    public void printSettings() {
        System.out.println("Screen Resolution: " + screenResolution);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Sound Volume: " + soundVolume);

    }
}
