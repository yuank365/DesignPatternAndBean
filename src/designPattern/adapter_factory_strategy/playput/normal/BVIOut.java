package designPattern.adapter_factory_strategy.playput.normal;

/**
 * @Author yuank
 * @Package designPattern.adapter_factory_strategy.playput.normal
 * @Date 2024/8/31 14:58
 * @description: BVI输出方式
 */
public class BVIOut implements NormalOut {
    public void playOut() {
        System.out.println("BVIOut");
    }
}