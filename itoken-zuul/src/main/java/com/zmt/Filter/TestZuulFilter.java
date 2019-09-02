package com.zmt.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class TestZuulFilter extends ZuulFilter {

    public String filterType() {    //过滤类型，pre路由之前，routing路由时，post路由之后，error发送错误调用
        return "pre";
    }

    public int filterOrder() {      //过滤顺序，指定过滤器执行顺序
        return 0;
    }

    public boolean shouldFilter() { //是否需要过滤
        return true;
    }

    public Object run() throws ZuulException {  //过滤器具体业务逻辑
        return null;
    }
}
