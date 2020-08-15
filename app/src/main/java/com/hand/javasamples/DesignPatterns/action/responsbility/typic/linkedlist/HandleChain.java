package com.hand.javasamples.DesignPatterns.action.responsbility.typic.linkedlist;

import com.hand.javasamples.DesignPatterns.action.responsbility.typic.AbstractHandler;

public class HandleChain {

    private AbstractHandler head;
    private AbstractHandler top;

    public void addHandler(AbstractHandler handler){
        if(head == null){
            head = handler;
            top = handler;
            return;
        }
        top.setNext(handler);
        top = handler;
    }

    public void doAction(){
        head.handle();
    }
}
