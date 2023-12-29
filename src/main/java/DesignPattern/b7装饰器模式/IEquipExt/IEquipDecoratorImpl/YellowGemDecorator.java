package DesignPattern.b7装饰器模式.IEquipExt.IEquipDecoratorImpl;

import DesignPattern.b7装饰器模式.IEquip;
import DesignPattern.b7装饰器模式.IEquipExt.IEquipDecorator;

/**
 * 黄宝石装饰品
 * 每颗攻击力+10
 */
public class YellowGemDecorator implements IEquipDecorator {

    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public YellowGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 10 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "+ 黄宝石";
    }

}
