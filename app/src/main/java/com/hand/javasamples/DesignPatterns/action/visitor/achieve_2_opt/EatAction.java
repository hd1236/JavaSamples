package com.hand.javasamples.DesignPatterns.action.visitor.achieve_2_opt;

public class EatAction {

    public void eat(Adult2 adult2){
        System.out.println("Adult2 eat");
    }

    public void eat(Child2 child2){
        System.out.println("Child2 eat");
    }
}
