package com.hand.javasamples.DesignPatterns.action.responsbility.typic;

import com.hand.javasamples.DesignPatterns.action.responsbility.typic.AbstractHandler;

public class HandlerThree extends AbstractHandler {
    @Override
    protected boolean doHandle() {
        System.out.println("HandlerThree doHandle");
        return false;
    }
}
