package com.yhd.crm.settings.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入用户控制器");
        String servletPath = request.getServletPath();
        if (servletPath.equals("/settings/user/xxx.do")){

        }
        if (servletPath.equals("/settings/user/xxx.do")){

        }
    }
}
