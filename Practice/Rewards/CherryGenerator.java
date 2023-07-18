package Practice.Rewards;

import Practice.FactoryBox;
import Practice.GameBox;

public class CherryGenerator extends FactoryBox {
    @Override
    public GameBox createGame() {
        return new CherryReward();
    }
}
