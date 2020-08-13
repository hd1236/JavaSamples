package com.hand.javasamples.DesignPatterns.action.strategy;

/**
 * 新增一种旅行方式
 */
public class RocketTravel implements TransportTravel{
    @Override
    public int travel() {
        System.out.println("火箭旅行");
        return 0;
    }
}
