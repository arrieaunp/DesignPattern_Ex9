public class App {
    public static void main(String[] args) {

        Game footballGame = new Game();
        footballGame.setStrategy(new Football());
        footballGame.playGame();
        Game basGame = new Game();
        basGame.setStrategy(new Basketball());
        basGame.playGame();

    }
}