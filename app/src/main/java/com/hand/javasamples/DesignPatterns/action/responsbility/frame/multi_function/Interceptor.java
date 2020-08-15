package com.hand.javasamples.DesignPatterns.action.responsbility.frame.multi_function;

public interface Interceptor {

    boolean preDoAction(Request request, Response response);

    void postDoAction(Request request, Response response);

    void onComplete(Request request, Response response);
}