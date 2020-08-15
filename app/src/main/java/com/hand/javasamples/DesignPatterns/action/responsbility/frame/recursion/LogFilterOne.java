package com.hand.javasamples.DesignPatterns.action.responsbility.frame.recursion;

public class LogFilterOne implements Filter {

    @Override
    public void doFilter(String request, String response, FilterChain chain) {
        request = "LogFilterOne request";
        System.out.println("LogFilterOne拦截请求request:"+request);
        chain.doFilter(request, response);
        response = "LogFilterOne response";
        System.out.println("LogFilterOne拦截响应response:"+response);
    }
}
