public class Main {
    public static void main(String[] args) {
        TheaterMessages.printWelcomeMessage();
        Theater theater = new Theater();
        theater.spectacleStart();
        TheaterMessages.printStartSpectacleMessage();
    }
}
