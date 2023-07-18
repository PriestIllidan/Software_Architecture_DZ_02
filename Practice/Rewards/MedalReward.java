package Practice.Rewards;

import Practice.GameBox;

public class MedalReward implements GameBox {
    @Override
    public void open() {
        System.out.print("Medal");
    }
}