package designPattern.adapter_factory_strategy.playput.advance;

/**
 * @Author yuank
 * @Package adapterpattern
 * @Date 2024/8/30 8:52
 * @description: mp3输出
 */
public class mp3Out implements AdvanceOut {
    @Override
    public void playOutAdvance() {
        System.out.println("mp3Out");
    }
}