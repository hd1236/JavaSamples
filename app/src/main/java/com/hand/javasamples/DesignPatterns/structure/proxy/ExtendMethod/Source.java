package com.hand.javasamples.DesignPatterns.structure.proxy.ExtendMethod;

/**
 * 如果被代理类是第三方开发，没有抽象接口，且不好修改
 */
public class Source {

    public void method() {
        // TODO Auto-generated method stub
        System.out.println("this is original method");
    }
}
