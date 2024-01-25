package DesignPattern.b10桥接模式.DrawAPIImpl;

import DesignPattern.b10桥接模式.DrawAPI;

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("绘制圆[ 颜色: 绿色, 半径: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }

}
