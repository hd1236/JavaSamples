package com.hand.javasamples.DesignPatterns.action.visitor.achieve_1;

/**
 * 成年人
 */
public class Adult1 extends People1 {

    public Adult1(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Adult eat");
    }

    @Override
    public void sleep() {
        System.out.println("Adult sleep");
    }
}
