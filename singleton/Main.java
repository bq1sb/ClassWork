package singleton;

public class Main {
    public static void main(String[] args) {
        GameSettings settings = GameSettings.getInstance();
        settings.setDifficulty("Easy");
        settings.setScreenResolution("1280x720");
        settings.setSoundVolume(75);
        settings.printSettings();
    }
}
