package com.example.discountservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/DiscountServlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        float amount = (float) (price * percent * 0.01);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<p> Discount Amount :" + percent);
        writer.println("<p> Discount Price :" + amount);
        writer.println("</html>");
    }
}
