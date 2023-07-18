package Practice.Rewards;

import Practice.GameBox;

public class CoinReward implements GameBox {
    @Override
    public void open() {
        System.out.print("Coin ");
    }
}
