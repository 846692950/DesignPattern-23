package DesignPattern.b7装饰器模式.IEquipImpl;


import DesignPattern.b7装饰器模式.IEquip;

/**
 * 武器
 * 攻击力20
 */
public class ArmEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙刀";
    }

}

