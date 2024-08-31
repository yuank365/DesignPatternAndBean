package designPattern.adapter_factory_strategy.playput.adapterplayout;

import designPattern.adapter_factory_strategy.playput.advance.AdvanceOut;
import designPattern.adapter_factory_strategy.playput.normal.NormalOut;

/**
 * @Author yuank
 * @Package adapterpattern
 * @Date 2024/8/30 8:55
 * @description: 用于适配advance接口到另一种到可被播放器识别的接口normal上
 */
public class SimpleAdapter implements NormalOut {
    public AdvanceOut advanceOut;

    //给予new路的一条路
    public SimpleAdapter(AdvanceOut advanceOut){
        this.advanceOut = advanceOut;
    }
    // 卡壳了 因为我们不需要管AVIOut 因为它有了自己的playOut实现了(normalOut接口)
    // 只需要《适配》advanceOut的实现 也即用本类统一到目标接口
    @Override
    public void playOut() {
        advanceOut.playOutAdvance();
    }
}