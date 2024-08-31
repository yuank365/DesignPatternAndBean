package designPattern.adapter_factory_strategy.outfactory_stupid.basicFactory.advanceFactory;

import designPattern.adapter_factory_strategy.outfactory_stupid.basicFactory.nomalFactory.InterfaceOutFactory;
import designPattern.adapter_factory_strategy.playput.advance.AdvanceOut;
import designPattern.adapter_factory_strategy.playput.normal.NormalOut;
import designPattern.adapter_factory_strategy.playput.adapterplayout.SimpleAdapter;

/**
 * @Author yuank
 * @Package adapterpattern
 * @Date 2024/8/30 11:13
 * @description: adapter == mp3 mp4
 */
public class adapterOutConcreteFactory implements InterfaceOutFactory {

    AdvanceOut advanceOut;

    public adapterOutConcreteFactory(AdvanceOut advanceOut) {
        this.advanceOut = advanceOut;
    }

    @Override
    public NormalOut creatConcreteObject() {
        return new SimpleAdapter(advanceOut);
    }
}