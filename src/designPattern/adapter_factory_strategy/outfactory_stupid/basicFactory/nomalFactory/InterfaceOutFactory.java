package designPattern.adapter_factory_strategy.outfactory_stupid.basicFactory.nomalFactory;

import designPattern.adapter_factory_strategy.playput.normal.NormalOut;

/**
 * @Author yuank
 * @Package adapterpattern
 * @Date 2024/8/30 9:07
 * @description: 实际上 工厂类对new factory()的选择逻辑并不负责 在FactoryDecision
 */
public interface InterfaceOutFactory {
    NormalOut creatConcreteObject();
}