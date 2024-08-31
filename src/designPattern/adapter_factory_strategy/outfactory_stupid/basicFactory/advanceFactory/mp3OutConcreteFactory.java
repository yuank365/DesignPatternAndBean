package designPattern.adapter_factory_strategy.outfactory_stupid.basicFactory.advanceFactory;

import designPattern.adapter_factory_strategy.playput.advance.mp3Out;

/**
 * @Author yuank
 * @Package designPattern.adapter_factroy.outfactory
 * @Date 2024/8/31 13:54
 * @description:
 */
public class mp3OutConcreteFactory{
    public mp3Out createMp3Out() {return new mp3Out();}
}