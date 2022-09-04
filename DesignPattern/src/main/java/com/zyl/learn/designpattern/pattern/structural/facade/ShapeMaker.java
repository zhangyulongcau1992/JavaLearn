package com.zyl.learn.designpattern.pattern.structural.facade;

/**
 * ClassName:ShapeMaker
 * Package:com.zyl.learn.designpattern.pattern.structural.facade
 * Description:
 *
 * @Date:2022/6/29 15:36
 * @Author:zhangyulong@qq.com
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /*
    画出古代钱币，先画出外面的圆形，在画出里面的正方形
     */
    public void drawMoney() {
        circle.draw();
        square.draw();
    }
}
