package Practice;

import Practice.Rewards.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
//        FactoryBox newFactory = new GoldGenerator();
//        newFactory.openReward();
//        FactoryBox newFactory1 = new SilverGenerator();
//        newFactory1.openReward();
        Random random = new Random();
        List<FactoryBox> factoryBoxList = new ArrayList<>();
        factoryBoxList.add(new GoldGenerator());
        factoryBoxList.add(new SilverGenerator());
        factoryBoxList.add(new CherryGenerator());
        factoryBoxList.add(new BananaGenerator());
        factoryBoxList.add(new CoinGenerator());
        factoryBoxList.add(new SilverGenerator());
        factoryBoxList.add(new StarGenerator());
        for (int i = 0; i < 20; i++) {
            FactoryBox factoryBox = factoryBoxList.get(random.nextInt(7));
            factoryBox.openReward();
        }
    }
}
