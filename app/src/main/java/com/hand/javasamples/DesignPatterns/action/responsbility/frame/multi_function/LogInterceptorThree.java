package com.hand.javasamples.DesignPatterns.action.responsbility.frame.multi_function;

public class LogInterceptorThree implements Interceptor {
    @Override
    public boolean preDoAction(Request request, Response response) {
        request.setRequest("LogInterceptorThree request");
        System.out.println("LogInterceptorThree拦截请求request:"+request.getRequest());
        return true;
    }

    @Override
    public void postDoAction(Request request, Response response) {
        response.setResponse("LogInterceptorThree response");
        System.out.println("LogInterceptorThree拦截响应response:"+response.getResponse());
    }

    @Override
    public void onComplete(Request request, Response response) {
        System.out.println("LogInterceptorThree完成："+request.getRequest()+"---"+response.getResponse());
    }
}
