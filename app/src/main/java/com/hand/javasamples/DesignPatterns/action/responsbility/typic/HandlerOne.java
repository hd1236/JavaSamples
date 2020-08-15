package com.hand.javasamples.DesignPatterns.action.responsbility.typic;

import com.hand.javasamples.DesignPatterns.action.responsbility.typic.AbstractHandler;

public class HandlerOne extends AbstractHandler {
    @Override
    protected boolean doHandle() {
        System.out.println("HandlerOne doHandle");
        return false;
    }
}
