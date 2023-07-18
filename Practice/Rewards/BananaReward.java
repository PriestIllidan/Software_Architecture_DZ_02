package Practice.Rewards;

import Practice.GameBox;

public class BananaReward implements GameBox {
    @Override
    public void open() {
        System.out.print("Banana ");
    }
}
