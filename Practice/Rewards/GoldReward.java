package Practice.Rewards;

import Practice.GameBox;

public class GoldReward implements GameBox {
    @Override
    public void open() {
        System.out.print("Gold ");
    }
}
