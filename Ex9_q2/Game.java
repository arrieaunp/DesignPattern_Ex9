public  class Game {

	private GameStrategy strategy;
	
	public void setStrategy(GameStrategy strategy) {
		this.strategy = strategy;
	}

	public void playGame() {
        strategy.initializeGame();
        strategy.playingGame();
        strategy.ShowResult();
    }


}
