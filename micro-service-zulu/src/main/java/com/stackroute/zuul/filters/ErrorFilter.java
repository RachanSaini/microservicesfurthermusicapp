package com.stackroute.zuul.filters;

import com.netflix.zuul.ZuulFilter;

public class ErrorFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("inside the error");
        return null;
    }
}
