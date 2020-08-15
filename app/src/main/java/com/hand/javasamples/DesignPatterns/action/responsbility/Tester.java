package com.hand.javasamples.DesignPatterns.action.responsbility;

import com.hand.javasamples.DesignPatterns.action.responsbility.frame.multi_function.InterceptorChain;
import com.hand.javasamples.DesignPatterns.action.responsbility.frame.multi_function.LogInterceptorOne;
import com.hand.javasamples.DesignPatterns.action.responsbility.frame.multi_function.LogInterceptorThree;
import com.hand.javasamples.DesignPatterns.action.responsbility.frame.multi_function.LogInterceptorTwo;
import com.hand.javasamples.DesignPatterns.action.responsbility.frame.multi_function.Request;
import com.hand.javasamples.DesignPatterns.action.responsbility.frame.multi_function.Response;
import com.hand.javasamples.DesignPatterns.action.responsbility.frame.recursion.FilterChain;
import com.hand.javasamples.DesignPatterns.action.responsbility.frame.recursion.LogFilterOne;
import com.hand.javasamples.DesignPatterns.action.responsbility.frame.recursion.LogFilterThree;
import com.hand.javasamples.DesignPatterns.action.responsbility.frame.recursion.LogFilterTwo;
import com.hand.javasamples.DesignPatterns.action.responsbility.typic.array.HandleArrayChain;
import com.hand.javasamples.DesignPatterns.action.responsbility.typic.linkedlist.HandleChain;
import com.hand.javasamples.DesignPatterns.action.responsbility.typic.HandlerOne;
import com.hand.javasamples.DesignPatterns.action.responsbility.typic.HandlerThree;
import com.hand.javasamples.DesignPatterns.action.responsbility.typic.HandlerTwo;

public class Tester {

    public static void main(String[] args){
//        testTypicLinkedlist();
//        testTypicArray();
//        testFrameRecursion();
        testFrameMultiFunction();
    }

    private static void testTypicLinkedlist(){
        HandleChain chain = new HandleChain();
        chain.addHandler(new HandlerOne());
        chain.addHandler(new HandlerTwo());
        chain.addHandler(new HandlerThree());
        chain.doAction();
    }


    private static void testTypicArray(){
        HandleArrayChain chain = new HandleArrayChain();
        chain.addHandler(new HandlerOne());
        chain.addHandler(new HandlerTwo());
        chain.addHandler(new HandlerThree());
        chain.doAction();
    }


    private static void testFrameRecursion(){
        FilterChain chain = new FilterChain();
        chain.addFilter(new LogFilterOne());
        chain.addFilter(new LogFilterTwo());
        chain.addFilter(new LogFilterThree());
        chain.doFilter("origin request","origin response");
    }

    private static void testFrameMultiFunction(){
        InterceptorChain chain = new InterceptorChain();
        chain.addFilter(new LogInterceptorOne());
        chain.addFilter(new LogInterceptorTwo());
        chain.addFilter(new LogInterceptorThree());

        Request request = new Request();
        Response response = new Response();
        request.setRequest("origin request");
        boolean noSuspend = chain.applyPreDoAction(request,response);

        //如果没有拦截处理的，继续执行后拦截操作
        if(noSuspend) {
            response.setResponse("origin response");
            chain.applyPostDoAction(request, response);
        }
    }
}
