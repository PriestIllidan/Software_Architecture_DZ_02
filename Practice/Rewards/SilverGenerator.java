package Practice.Rewards;

import Practice.FactoryBox;
import Practice.GameBox;

public class SilverGenerator extends FactoryBox {
    @Override
    public GameBox createGame() {
        return new SilverReward();
    }
}
