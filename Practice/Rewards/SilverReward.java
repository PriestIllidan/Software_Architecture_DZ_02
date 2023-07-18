package Practice.Rewards;

import Practice.GameBox;

public class SilverReward implements GameBox {
    @Override
    public void open() {
        System.out.print("Silver ");
    }
}