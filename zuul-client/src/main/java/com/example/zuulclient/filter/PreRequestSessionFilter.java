//package com.example.zuulclient.filter;
//
//import com.netflix.zuul.ZuulFilter;
//
//import com.netflix.zuul.context.RequestContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//
//public class PreRequestSessionFilter extends ZuulFilter {
//
//
//    @Autowired
//    HttpServletRequest httpServletRequest;
//
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//
//    /**
//     * 返回一个值来指定过滤器的执行顺序，不同过滤器允许返回相同的数字，数字越小顺序越靠前
//     */
//    @Override
//    public int filterOrder() {
//        return 1;
//    }
//
//    /**
//     * 返回一个boolean值来判断该过滤器是否要执行，true：执行，false：不执行
//     */
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    /**
//     * 过滤器的具体逻辑
//     */
//    @Override
//    public Object run() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        String sessionId = httpServletRequest.getSession().getId();
//        System.out.println("sessionId: " + sessionId);
//        ctx.addZuulRequestHeader("Cloud-Cookie", "SESSION=" + sessionId);
//        ctx.setSendZuulResponse(true);  // 对该请求进行路由
//        ctx.setResponseStatusCode(200); // 返回200正确响应
//
//        return null;
//    }
//
//}
