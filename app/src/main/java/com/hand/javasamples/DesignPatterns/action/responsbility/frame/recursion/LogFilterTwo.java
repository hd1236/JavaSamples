package com.hand.javasamples.DesignPatterns.action.responsbility.frame.recursion;

public class LogFilterTwo implements Filter {

    @Override
    public void doFilter(String request, String response, FilterChain chain) {
        request = "LogFilterTwo request";
        System.out.println("LogFilterTwo拦截请求request:"+request);
        chain.doFilter(request, response);
        response = "LogFilterTwo response";
        System.out.println("LogFilterTwo拦截响应response:"+response);
    }
}
