package Strategy;
/*
 * @Author yuank
 * @Date 2024/8/24 14:13
 * @Description 飞翔行为的接口
 */

class diKonFly implements FlyBehavior{
    @Override
    public String fly() {
        return "在低空飞行";
    }
}