package Practice.Rewards;

import Practice.FactoryBox;
import Practice.GameBox;

public class BananaGenerator extends FactoryBox {
    @Override
    public GameBox createGame() {
        return new BananaReward();
    }
}
