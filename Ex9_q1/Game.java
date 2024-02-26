public abstract class Game {

	protected abstract void initializeGame();
	protected abstract void playingGame();
	protected abstract void ShowResult();
	
	// template method
	public final void playGame() {
		initializeGame();
		playingGame();
		ShowResult();
	}

}
