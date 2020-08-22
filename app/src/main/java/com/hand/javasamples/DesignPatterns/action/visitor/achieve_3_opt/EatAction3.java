package com.hand.javasamples.DesignPatterns.action.visitor.achieve_3_opt;

import com.hand.javasamples.DesignPatterns.action.visitor.achieve_2_opt.Adult2;
import com.hand.javasamples.DesignPatterns.action.visitor.achieve_2_opt.Child2;

public class EatAction3 {

    public void eat(Adult3 adult2){
        System.out.println(adult2.getName()+"Adult3 eat");
    }

    public void eat(Child3 child2){
        System.out.println(child2.getName()+"Child3 eat");
    }
}
