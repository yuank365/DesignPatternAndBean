package designPattern.adapter_factory_strategy.outfactory_stupid.basicFactory.advanceFactory;

import designPattern.adapter_factory_strategy.playput.advance.mp4Out;

/**
 * @Author yuank
 * @Package designPattern.adapter_factroy.outfactory
 * @Date 2024/8/31 13:54
 * @description:
 */
public class mp4OutConcreteFactory {
    public mp4Out createMp4Out() {return new mp4Out();}
}