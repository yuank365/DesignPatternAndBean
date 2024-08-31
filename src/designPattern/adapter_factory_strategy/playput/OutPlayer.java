package designPattern.adapter_factory_strategy.playput;

import designPattern.adapter_factory_strategy.outfactory_stupid.FactoryDecision.lastNo2FactoryDecision;
import designPattern.adapter_factory_strategy.playput.normal.NormalOut;

/**
 * @Author yuank
 * @Package designPattern.adapter_factroy.playput.adapterplayout
 * @Date 2024/8/31 13:42
 * @description: 给main使用的。。。
 */
public class OutPlayer {
    public void play(String decision) {
        lastNo2FactoryDecision lastNo2FactoryDecision = new lastNo2FactoryDecision();
        NormalOut outPlay = lastNo2FactoryDecision.getDecision(decision);
        if (outPlay == null) {
            System.out.println("没有这个格式");
        }else {
            outPlay.playOut();
        }
    }
}