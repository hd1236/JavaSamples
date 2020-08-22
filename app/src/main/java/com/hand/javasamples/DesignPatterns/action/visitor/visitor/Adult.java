package com.hand.javasamples.DesignPatterns.action.visitor.visitor;


/**
 * 成年人
 */
public class Adult extends People {

    public Adult(String name) {
        super(name);
    }

    @Override
    public void doAction(ActionVisitor visitor) {
        visitor.visit(this);
    }

}
