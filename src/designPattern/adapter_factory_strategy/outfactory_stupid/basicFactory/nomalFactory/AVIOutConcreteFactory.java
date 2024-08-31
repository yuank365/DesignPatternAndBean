package designPattern.adapter_factory_strategy.outfactory_stupid.basicFactory.nomalFactory;

import designPattern.adapter_factory_strategy.playput.normal.AVIOut;
import designPattern.adapter_factory_strategy.playput.normal.NormalOut;

/**
 * @Author yuank
 * @Package adapterpattern
 * @Date 2024/8/30 11:20
 * @description:
 */
public class AVIOutConcreteFactory implements InterfaceOutFactory {
    @Override
    public NormalOut creatConcreteObject() {
        return new AVIOut();
    }
}