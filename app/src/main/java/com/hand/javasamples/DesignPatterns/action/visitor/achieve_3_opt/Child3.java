package com.hand.javasamples.DesignPatterns.action.visitor.achieve_3_opt;


/**
 * 小孩
 */
public class Child3 extends People3 {
    public Child3(String name) {
        super(name);
    }

    @Override
    public void doAction(EatAction3 eatAction) {
        eatAction.eat(this);
    }


}
