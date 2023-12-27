package DesignPattern.a1工厂模式;

import DesignPattern.a1工厂模式.ShapeImp.Circle;
import DesignPattern.a1工厂模式.ShapeImp.Rectangle;
import DesignPattern.a1工厂模式.ShapeImp.Square;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 */
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("圆形")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("长方形")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("正方形")){
            return new Square();
        }
        return null;
    }
}
