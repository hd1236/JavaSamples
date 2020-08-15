package com.hand.javasamples.DesignPatterns.action.responsbility.frame.multi_function;

import java.util.ArrayList;
import java.util.List;

public class InterceptorChain {

    private List<Interceptor> interceptors = new ArrayList<>();

    private int interceptorIndex;//前filter提前拦截的index

    public void addFilter(Interceptor interceptor){
        interceptors.add(interceptor);
        interceptorIndex = interceptors.size() - 1;
    }

    public boolean applyPreDoAction(Request request, Response response){
        for(int i = 0; i < interceptors.size(); i++){
            boolean pre = interceptors.get(i).preDoAction(request,response);
            if(!pre){
                //执行前filter过程中，有filter提前拦截处理了
                interceptorIndex = i;
                applyOnComplete(request,response);
                return false;
            }
        }
        //执行完了所有前filter动作
        return true;
    }

    public void applyPostDoAction(Request request, Response response){
        //这里后filter操作要反向遍历
        for(int i = interceptors.size() - 1;i >= 0; i--){
            interceptors.get(i).postDoAction(request,response);
        }

        applyOnComplete(request,response);
    }

    private void applyOnComplete(Request request, Response response){
        for(int i = interceptorIndex;i >= 0; i--){
            interceptors.get(i).onComplete(request,response);
        }
    }
}
