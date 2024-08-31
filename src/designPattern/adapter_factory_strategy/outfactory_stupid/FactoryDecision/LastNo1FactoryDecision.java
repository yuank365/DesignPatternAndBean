package designPattern.adapter_factory_strategy.outfactory_stupid.FactoryDecision;

import designPattern.adapter_factory_strategy.playput.adapterplayout.SimpleAdapter;
import designPattern.adapter_factory_strategy.playput.advance.mp3Out;
import designPattern.adapter_factory_strategy.playput.advance.mp4Out;
import designPattern.adapter_factory_strategy.playput.normal.NormalOut;

/**
 * @Author yuank
 * @Package designPattern.adapter_factroy.outfactory
 * @Date 2024/8/31 14:22
 * @description: 对适配器进行逻辑处理
 */
public class LastNo1FactoryDecision {
    public NormalOut creatAdapterOutByAdvanceOut(String decision) {
        if (decision.equals("mp3")){
            return new SimpleAdapter(new mp3Out());
        }
        if (decision.equals("mp4")){
            return new SimpleAdapter(new mp4Out());
        }
        return null;
    }
}