package DesignPattern.b7装饰器模式;

/**
 * 装备的接口
 */
public interface IEquip {

    /**
     * 计算攻击力
     */
    public int caculateAttack();

    /**
     * 装备的描述
     */
    public String description();
}

