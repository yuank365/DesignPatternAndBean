package designPattern.adapter_factory_strategy.outfactory_stupid.FactoryDecision;

import designPattern.adapter_factory_strategy.outfactory_stupid.basicFactory.nomalFactory.AVIOutConcreteFactory;
import designPattern.adapter_factory_strategy.playput.normal.NormalOut;

/**
 * @Author yuank
 * @Package adapterpattern
 * @Date 2024/8/30 11:32
 * @description:
 */
public class lastNo2FactoryDecision {
//public InterfaceOutFactory getDecision(String decision) 这样你会发现工厂类我们不能统一 需要分层
    public NormalOut getDecision(String decision){
        if (decision.equals("AVI")) {
            return new AVIOutConcreteFactory().creatConcreteObject();//第一层不需要逻辑处理
        }
        if (decision.equals("mp3")||decision.equals("mp4")) {
            LastNo1FactoryDecision lastNo1FactoryDecision = new LastNo1FactoryDecision();
            return lastNo1FactoryDecision.creatAdapterOutByAdvanceOut(decision);//第二层的new需要逻辑逻辑处理 对标适配器类层
        }
        return null;
    }
}