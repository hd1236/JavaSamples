package com.hand.javasamples.DesignPatterns.action.responsbility.frame.multi_function;

public class LogInterceptorOne implements Interceptor {
    @Override
    public boolean preDoAction(Request request, Response response) {
        request.setRequest("LogInterceptorOne request");
        System.out.println("LogInterceptorOne拦截请求request:"+request.getRequest());
        return true;
    }

    @Override
    public void postDoAction(Request request, Response response) {
        response.setResponse("LogInterceptorOne response");
        System.out.println("LogInterceptorOne拦截响应response:"+response.getResponse());
    }

    @Override
    public void onComplete(Request request, Response response) {
        System.out.println("LogInterceptorOne完成："+request.getRequest()+"---"+response.getResponse());
    }
}
