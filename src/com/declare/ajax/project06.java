package com.declare.ajax;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/project06")
public class project06 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String val = request.getParameter("computerId");
        List computer = new ArrayList();
        if(val.equals("1")){
            computer.add("M24");
            computer.add("98K");
            computer.add("M4A1");
        }else if(val.equals("2")){
            computer.add("顺子");
            computer.add("王炸");
            computer.add("飞机");
        }else if(val.equals("3")){
            computer.add("排位");
            computer.add("匹配");
            computer.add("人机");
        }
        String json = JSON.toJSONString(computer);
        System.out.println(json);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(json);
    }
}
