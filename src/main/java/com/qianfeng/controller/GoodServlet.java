package com.qianfeng.controller;

import com.qianfeng.bean.WxbGood;
import com.qianfeng.utils.ServiceUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GoodServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String pagez=req.getParameter("page");
       pagez=pagez==null?"1":pagez;
        List<WxbGood> goodList = ServiceUtils.getservice().queryGoodsByPage(Integer.parseInt(pagez));
       req.setAttribute("goodsList",goodList);
       req.getRequestDispatcher("goods_list.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
