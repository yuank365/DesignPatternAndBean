package Strategy.nodesignpattern;

/**
 * @Author yuank
 * @Package no1.nodesignpattern
 * @Date 2024/8/27 18:13
 * @description: 客户端
 */
public class client {
    public static void main(String[] args) {
        int price = 100;
        Zeko zeko = new Zeko();
        System.out.println(zeko.zeko1(1,price));
    }
}