package com.hand.javasamples.DesignPatterns.action.visitor.achieve_1;

/**
 * 定义一个可被访问的类，人类
 * 人类有一些行为，吃、睡
 */
public abstract class People1 {

    private String name;

    public People1(String name){
        this.name = name;
    }

    public abstract void eat();

    public abstract void sleep();

}
