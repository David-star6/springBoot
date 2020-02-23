package com.example.bilibili.component;

import com.example.bilibili.utlis.LoggerUtli;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆检查
 */
public class LoginHandlerInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        if (user == null) {
            //返回登陆页面
            request.setAttribute("msg", "没有权限，请登陆");
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        } else {
            //放行请求
            return true;
        }
    }

}
