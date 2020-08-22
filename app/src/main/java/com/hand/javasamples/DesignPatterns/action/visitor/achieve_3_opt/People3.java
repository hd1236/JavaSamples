package com.hand.javasamples.DesignPatterns.action.visitor.achieve_3_opt;


/**
 * 定义一个可被访问的类，人类
 * 人类有一些行为，吃、睡
 */
public abstract class People3 {

    private String name;

    public People3(String name){
        this.name = name;
    }

    public abstract void doAction(EatAction3 eatAction);

    public String getName() {
        return name;
    }
}
