package Practice.Rewards;

import Practice.GameBox;

public class StarReward implements GameBox {
    @Override
    public void open() {
        System.out.print("Star ");
    }
}
