package Practice.Rewards;

import Practice.GameBox;

public class CherryReward implements GameBox {
    @Override
    public void open() {
        System.out.print("Cherry ");
    }
}
