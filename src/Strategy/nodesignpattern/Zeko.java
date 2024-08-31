package Strategy.nodesignpattern;

/**
 * @Author yuank
 * @Package no1.nodesignpattern
 * @Date 2024/8/27 19:03
 * @description: 则扣类
 */
public class Zeko {
    public double zeko1(int type,double price){
        switch(type){
            case 1:
                return price * 0.5;
            case 2:
                return price * 0.75;
            case 3:
                return price * 0.95;
        }
        return price;
    }
}