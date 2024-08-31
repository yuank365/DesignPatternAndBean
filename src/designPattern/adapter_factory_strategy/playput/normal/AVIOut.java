package designPattern.adapter_factory_strategy.playput.normal;

/**
 * @Author yuank
 * @Package adapterpattern
 * @Date 2024/8/30 9:03
 * @description: 使用默认输出接口的播放输出
 */
public class AVIOut implements NormalOut {
    public void playOut() {
        System.out.println("AVIOut");
    }
}