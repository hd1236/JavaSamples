package com.hand.javasamples.DesignPatterns.action.responsbility.frame.multi_function;

public class LogInterceptorTwo implements Interceptor {
    @Override
    public boolean preDoAction(Request request, Response response) {
//        request.setRequest("LogInterceptorTwo request");
//        System.out.println("LogInterceptorTwo拦截请求request:"+request.getRequest());
//        return true;

        //模拟拦截处理
        request.setRequest("LogInterceptorTwo request");
        System.out.println("LogInterceptorTwo拦截请求request并处理:"+request.getRequest());
        response.setResponse("LogInterceptorTwo deal response");
        return false;
    }

    @Override
    public void postDoAction(Request request, Response response) {
        response.setResponse("LogInterceptorTwo response");
        System.out.println("LogInterceptorTwo拦截响应response:"+response.getResponse());
    }

    @Override
    public void onComplete(Request request, Response response) {
        System.out.println("LogInterceptorTwo完成："+request.getRequest()+"---"+response.getResponse());
    }
}
