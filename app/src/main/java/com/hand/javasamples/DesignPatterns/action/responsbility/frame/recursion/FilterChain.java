package com.hand.javasamples.DesignPatterns.action.responsbility.frame.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归链，可以在前后分别处理请求和响应
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();

    private int pos = 0;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void doFilter(String request, String response) {
        if (pos < filters.size()) {
            Filter filter = filters.get(pos);
            pos++;
            filter.doFilter(request, response, this);
        } else {
            //filter都处理完后，执行下一步动作
            doAction(request, response);
        }
    }

    /**
     * 处理请求
     * @param request
     * @param response
     */
    private void doAction(String request, String response) {
        System.out.println("last request:"+request+"----"+"last response:"+response);
        System.out.println("FilterChain doAction");
    }
}
