package com.siztao.jenkins.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HelloServlet",urlPatterns = "/helloServlet")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Integer> lists = new ArrayList<>();
        for(int i=0;i<10;i++){
            lists.add(i);
        }
        request.setAttribute("lists",lists);
        request.setAttribute("msg","新年快乐 JavaWeb!!");
        request.getRequestDispatcher("/WEB-INF/pages/welcome.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
