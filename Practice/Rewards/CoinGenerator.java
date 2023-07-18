package Practice.Rewards;

import Practice.FactoryBox;
import Practice.GameBox;

public class CoinGenerator extends FactoryBox {
    @Override
    public GameBox createGame() {
        return new CherryReward();
    }
}
