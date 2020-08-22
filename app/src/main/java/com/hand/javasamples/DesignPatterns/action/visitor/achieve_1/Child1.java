package com.hand.javasamples.DesignPatterns.action.visitor.achieve_1;

/**
 * 小孩
 */
public class Child1 extends People1 {
    public Child1(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Child eat");
    }

    @Override
    public void sleep() {
        System.out.println("Child sleep");
    }
}
