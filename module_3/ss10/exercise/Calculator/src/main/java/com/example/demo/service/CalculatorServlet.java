package com.example.demo.service;

import com.example.demo.model.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    Calculator calculator = new Calculator();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));
        char operator = request.getParameter("operator").charAt(0);
        try {
            float result = calculator.calculate(number1, number2, operator);
            request.setAttribute("result", result);
            request.setAttribute("number1", number1);
            request.setAttribute("number2", number2);
            request.setAttribute("operator", operator);
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } catch (RuntimeException e) {
            request.setAttribute("Error", e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
