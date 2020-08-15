package com.hand.javasamples.DesignPatterns.action.responsbility.typic.array;

import com.hand.javasamples.DesignPatterns.action.responsbility.typic.AbstractHandler;

import java.util.ArrayList;
import java.util.List;

public class HandleArrayChain {

    private List<AbstractHandler> handlers = new ArrayList<>();

    public void addHandler(AbstractHandler handler){
        handlers.add(handler);
    }


    public void doAction(){
        for(AbstractHandler handler : handlers){
            if(handler.handle()){
                break;
            }
        }
    }
}
