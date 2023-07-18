package Practice.Rewards;

import Practice.FactoryBox;
import Practice.GameBox;

public class MedalGenerator extends FactoryBox {
    @Override
    public GameBox createGame() {
        return new MedalReward();
    }
}
