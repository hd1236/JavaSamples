package com.hand.javasamples.DesignPatterns.action.visitor.visitor;

/**
 * 定义一个可被访问的类，人类
 * 人类有一些行为，吃、睡
 */
public abstract class People {

    private String name;

    public People(String name){
        this.name = name;
    }

    public abstract void doAction(ActionVisitor visitor);

    public String getName() {
        return name;
    }
}
