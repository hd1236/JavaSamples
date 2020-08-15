package com.hand.javasamples.DesignPatterns.action.responsbility.frame.recursion;

public class LogFilterThree implements Filter {

    @Override
    public void doFilter(String request, String response, FilterChain chain) {
        request = "LogFilterThree request";
        System.out.println("LogFilterThree拦截请求request:"+request);
        chain.doFilter(request, response);
        response = "LogFilterThree response";
        System.out.println("LogFilterThree拦截响应response:"+response);
    }
}
