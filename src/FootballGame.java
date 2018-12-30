public class FootballGame extends Game {
    @Override
    void initialize() {
        System.out.println("FootballGame  initializing");

    }

    @Override
    void startPlay() {
        System.out.println("FootballGame  Starting");
    }

    @Override
    void endPlay() {
        System.out.println("FootballGame  Ending");
    }
}
