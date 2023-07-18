package Practice.Rewards;

import Practice.FactoryBox;
import Practice.GameBox;

public class GoldGenerator extends FactoryBox {
    @Override
    public GameBox createGame() {
        return new GoldReward();
    }
}
