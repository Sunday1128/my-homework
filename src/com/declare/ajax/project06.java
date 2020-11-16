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
            computer.add("全家桶");
            computer.add("冰淇淋");
            computer.add("甜品派");
        }else if(val.equals("2")){
            computer.add("果茶");
            computer.add("奶茶");
            computer.add("冰淇淋");
        }else if(val.equals("3")){
            computer.add("包子");
            computer.add("馒头");
            computer.add("油条");
        }
        String json = JSON.toJSONString(computer);
        System.out.println(json);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(json);
    }
}
