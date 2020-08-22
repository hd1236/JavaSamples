package com.hand.javasamples.DesignPatterns.action.visitor.visitor;

public class EatAction implements ActionVisitor {
    @Override
    public void visit(People people) {
        System.out.println(people.getName()+"do EatAction");
    }
}
