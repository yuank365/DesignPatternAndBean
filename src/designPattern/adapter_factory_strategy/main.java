package designPattern.adapter_factory_strategy;

import designPattern.adapter_factory_strategy.playput.OutPlayer;

/**
 * @Author yuank
 * @Package adapterpattern
 * @Date 2024/8/30 9:50
 * @description:
 */
public class main {
    public static void main(String[] args) {
        OutPlayer outPlayer = new OutPlayer();
        outPlayer.play("mp3");
    }
}