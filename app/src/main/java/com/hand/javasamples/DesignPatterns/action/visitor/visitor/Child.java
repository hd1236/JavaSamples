package com.hand.javasamples.DesignPatterns.action.visitor.visitor;


/**
 * 小孩
 */
public class Child extends People {
    public Child(String name) {
        super(name);
    }

    @Override
    public void doAction(ActionVisitor visitor) {
        visitor.visit(this);
    }

}
