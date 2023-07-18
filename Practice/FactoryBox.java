package Practice;

public abstract class FactoryBox {
    public abstract GameBox createGame();

    public void openReward() {
        GameBox gameBox = createGame();
        gameBox.open();
    }
}