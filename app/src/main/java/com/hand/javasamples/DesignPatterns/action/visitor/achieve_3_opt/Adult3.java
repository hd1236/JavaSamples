package com.hand.javasamples.DesignPatterns.action.visitor.achieve_3_opt;


/**
 * 成年人
 */
public class Adult3 extends People3 {

    public Adult3(String name) {
        super(name);
    }

    @Override
    public void doAction(EatAction3 eatAction) {
        eatAction.eat(this);
    }


}
