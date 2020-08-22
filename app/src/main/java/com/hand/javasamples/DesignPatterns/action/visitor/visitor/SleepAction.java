package com.hand.javasamples.DesignPatterns.action.visitor.visitor;

public class SleepAction implements ActionVisitor {
    @Override
    public void visit(People people) {
        System.out.println(people.getName()+"do SleepAction");
    }
}
