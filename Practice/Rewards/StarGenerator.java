package Practice.Rewards;

import Practice.FactoryBox;
import Practice.GameBox;

public class StarGenerator extends FactoryBox {
    @Override
    public GameBox createGame() {
        return new StarReward();
    }
}
