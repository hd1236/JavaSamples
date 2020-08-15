package com.hand.javasamples.DesignPatterns.action.responsbility.typic;

import com.hand.javasamples.DesignPatterns.action.responsbility.typic.AbstractHandler;

public class HandlerTwo extends AbstractHandler {
    @Override
    protected boolean doHandle() {
        System.out.println("HandlerTwo doHandle");
        return false;
    }
}
