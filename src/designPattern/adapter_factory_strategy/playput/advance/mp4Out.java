package designPattern.adapter_factory_strategy.playput.advance;

/**
 * @Author yuank
 * @Package adapterpattern
 * @Date 2024/8/30 8:53
 * @description:
 */
public class mp4Out implements AdvanceOut {
    @Override
    public void playOutAdvance() {
        System.out.println("mp4Out");
    }
}